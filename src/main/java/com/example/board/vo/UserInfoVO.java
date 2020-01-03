package com.example.board.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@ToString
public class UserInfoVO {
	private int userId;
	private String password;
	private String email;
	private Date createDate = new Date();
	private Date update = new Date();
} 

