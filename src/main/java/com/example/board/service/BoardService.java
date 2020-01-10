package com.example.board.service;

import com.example.board.model.UserInfo;

public interface BoardService {
	
	public UserInfo getUser(String userId) throws Exception;
	
}

