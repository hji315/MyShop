package com.team.shop.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.team.shop.model.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {

	@Inject
	private SqlSession sql;

	//QNA 조회
	@Override
	public List<ReplyVO> readReply_qna(int product_id) throws Exception {
		return sql.selectList("replyMapper.readReply_qna", product_id);
	}
	
	//리뷰 조회
	@Override
	public List<ReplyVO> readReply_review(int product_id) throws Exception {
		return sql.selectList("replyMapper.readReply_review", product_id);
	}

	//QNA 작성
	@Override
	public void writeReply_qna(ReplyVO vo) throws Exception {
		sql.insert("replyMapper.writeReply_qna", vo);
	}

	//리뷰 작성
	@Override
	public void writeReply_review(ReplyVO vo) throws Exception {
		sql.insert("replyMapper.writeReply_review", vo);
	}

		
}
