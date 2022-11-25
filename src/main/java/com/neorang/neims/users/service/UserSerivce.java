package com.neorang.neims.users.service;


import com.neorang.neims.users.exception.DuplicatedException;
import com.neorang.neims.users.UserRepository;
import com.neorang.neims.users.domain.Role;
import com.neorang.neims.users.domain.Users;
import com.neorang.neims.users.dto.SignupForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserSerivce {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public void save(SignupForm signupForm){
        Assert.notNull(signupForm.getUserId(), "ID must be provided");
        Assert.notNull(signupForm.getEmail(), "Email must be provided");
        Assert.notNull(signupForm.getPassword(), "Password must be provided");

        Users duplicatedUserId = findByIgnoreCaseId(signupForm.getUserId());
        Users duplicatedUserEmail = findByEmail(signupForm.getEmail());
        String encodePassword = passwordEncoder.encode(signupForm.getPassword());

        if(!ObjectUtils.isEmpty(duplicatedUserId)) throw new DuplicatedException(signupForm.getUserId());
        if(!ObjectUtils.isEmpty(duplicatedUserEmail)) throw new DuplicatedException(signupForm.getEmail());

        Users user = signupForm.toEntity();
        user.setPassword(encodePassword);
        user.setRole(Role.USER);

        userRepository.save(user);
    }

    public Users findById(String userId){
        return userRepository.findById(userId).orElse(null);
    }

    public Users findByIgnoreCaseId(String userId){ return userRepository.findByIgnoreCaseUserId(userId).orElse(null); }

    public Users findByEmail(String userId){ return userRepository.findByEmail(userId).orElse(null); }


}
