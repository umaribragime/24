package org._24.auth.service;

import org._24.auth.dto.*;
import org._24.auth.entity.User;
import org._24.auth.repository.UserRepository;
import org._24.auth.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    JwtTokenProvider jwtTokenProvider;

    public AuthResponse register(RegisterRequest request){
        if (userRepository.findByEmail(request.getEmail()).isPresent()){
            throw new RuntimeException("This Email already exists!");
        }
        String hashedPassword = passwordEncoder.encode(request.getPassword());

        User user = new User(
                request.getEmail(),
                hashedPassword,
                request.getName()
        );

        User savedUser = userRepository.save(user);

//        return Response
        return new AuthResponse(
                null, // no token for registration,
                "User registered Successfully",
                savedUser.getEmail()
        );
    }
    public AuthResponse login(LoginRequest request){
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found!"));
        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())){
            throw new RuntimeException("Invalid password");
        }
        String token = jwtTokenProvider.generateToken(user.getId(), user.getEmail());

        return new AuthResponse(
                token, "Login Successful",
                user.getEmail()
        );

    }

}
