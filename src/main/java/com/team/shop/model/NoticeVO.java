package com.team.shop.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NoticeVO {

	// 관리자 권한 체크
	private int adminCk;
	
	// 게시판 번호
	private int bno;
	
	// 게시판 제목
	private String title;	

	// 게시판 내용
	private String content;	
	
	// 게시판 작성자
	private String writer;	
	
	// 등록 날짜
	private Date regDate;	

	public NoticeVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "NoticeVO [adminCk=" + adminCk + ", bno=" + bno + ", title=" + title + ", content=" + content
				+ ", writer=" + writer + ", regDate=" + regDate + "]";
	}

}