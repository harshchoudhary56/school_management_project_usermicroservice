package com.school_management_system.usermicroservice.service;

import com.school_management_system.usermicroservice.entities.User;
import com.school_management_system.usermicroservice.repository.UserRegisterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRegisterService implements UserDetailsService {

    private UserRegisterRepository userRegisterRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRegisterRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("user not found"));
    }

    public UserDetails save(User user) {
        return userRegisterRepository.save(user);
    }
}
