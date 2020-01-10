package com.example.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board.model.UserInfo;
import com.example.board.repository.UserRepository;
import com.example.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private UserRepository userRepository;
	
	public UserInfo getUser(String userId) {
		return userRepository.findUserByUserId(userId);
	}
	
}

