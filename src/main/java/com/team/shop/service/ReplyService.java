package com.team.shop.service;

import java.util.List;

import com.team.shop.model.ReplyVO;

public interface ReplyService {
	
	public List<ReplyVO> readReply_qna(int product_id) throws Exception;
	
	public List<ReplyVO> readReply_review(int product_id) throws Exception;
	
	public void writeReply_qna(ReplyVO vo) throws Exception;
	
	public void writeReply_review(ReplyVO vo) throws Exception;
	
	
}
