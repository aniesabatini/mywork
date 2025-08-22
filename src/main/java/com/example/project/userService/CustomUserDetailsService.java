package com.example.project.userService;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final String encodedPassword;

    public CustomUserDetailsService(PasswordEncoder passwordEncoder) {
        this.encodedPassword = passwordEncoder.encode("password"); // encode once
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("user".equals(username)) {
            return User.builder()
                       .username("user")
                       .password(encodedPassword)  // reuse same hash
                       .roles("USER")
                       .build();
        }
        throw new UsernameNotFoundException("User not found: " + username);
    }
}
