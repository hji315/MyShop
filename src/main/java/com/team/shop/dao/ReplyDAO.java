package com.team.shop.dao;

import java.util.List;

import com.team.shop.model.ReplyVO;

public interface ReplyDAO {
	
	//QNA 조회
	public List<ReplyVO> readReply_qna(int product_id) throws Exception;
	
	//리뷰 조회
	public List<ReplyVO> readReply_review(int product_id) throws Exception;
	
	//QNA 작성
	public void writeReply_qna(ReplyVO vo) throws Exception;
	
	//리뷰 작성
	public void writeReply_review(ReplyVO vo) throws Exception;
}
