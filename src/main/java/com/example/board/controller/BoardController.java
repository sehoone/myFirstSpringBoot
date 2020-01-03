package com.example.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.vo.UserInfoVO;

@RestController
@RequestMapping(value="/api")
public class BoardController {

	public BoardController() {
		System.out.println("===> BoardController 생성");
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello(String name) {
		System.out.println("===> hello");
		return "Hello : " + name;
	}
	
	@GetMapping("/getUserList")
	public List<UserInfoVO> getBoardList() {
		List<UserInfoVO> userList = new ArrayList<UserInfoVO>();
		
		return userList;
	}


}
