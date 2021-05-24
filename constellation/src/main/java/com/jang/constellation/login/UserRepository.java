package com.jang.constellation.login;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfo, Long> {
	  Optional<UserInfo> findById(String id);
	}