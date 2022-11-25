package com.neorang.neims.users;

import com.neorang.neims.users.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, String> {

    Optional<Users> findByEmail(String email);

    Optional<Users> findByIgnoreCaseUserId(String userId);

}
