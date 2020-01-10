package com.example.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.model.UserInfo;
import com.example.board.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value="/api")
@Slf4j
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	public BoardController() {
		System.out.println("===> BoardController 생성");
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello(String name) {
		log.debug("===> hello");
		return "Hello : " + name;
	}
	
	@RequestMapping(value="/getUserInfo", method=RequestMethod.GET)
	public UserInfo getUserInfo(String userId) throws Exception {
		log.debug("userName = {}", userId);
		UserInfo userInfo = boardService.getUser(userId);
		return userInfo;
	}
	/*
	@GetMapping("/getUserList")
	public List<UserInfoVO> getBoardList() {
		List<UserInfoVO> userList = new ArrayList<UserInfoVO>();
		
		return userList;
	}
	 */

}
