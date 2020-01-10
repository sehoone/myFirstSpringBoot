package com.example.board.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.board.model.UserInfo;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, Long> {
	@Query(value = "SELECT u FROM USER_INFO u WHERE u.USER_ID = :userId")
	UserInfo findUserByUserId(@Param("userId") String userId);
}