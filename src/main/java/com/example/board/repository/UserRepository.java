package com.example.board.repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value = "SELECT u FROM USER_INFO u WHERE u.USER_ID = :userId")
	User findUserByUserId(@Param("userId") String userName);
}