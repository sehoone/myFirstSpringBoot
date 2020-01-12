package com.example.board.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "UserInfo")
@Table(name = "USER_INFO")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
	@Id
	@Column(name = "USER_ID", length = 20, nullable = false)
	private String userId;
	@Column(length = 255, nullable = true)
	private String password;
	@Column(length = 255, nullable = true)
	private String email;
	
    @Column(name = "CREATE_DATE", updatable = false)
	private LocalDate createDate;
    @Column(name = "UPDATE_DATE", updatable = false)
	private LocalDate updateDate;
	/*
	@ManyToMany
	@JoinTable(name = "user_role",
			   joinColumns = @JoinColumn(name = "user_seq"),
			   inverseJoinColumns = @JoinColumn(name = "role_seq"))
	private List<Role> roleList;*/
}