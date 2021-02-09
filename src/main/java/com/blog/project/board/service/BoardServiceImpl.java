package com.blog.project.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.blog.project.board.dao.BoardDAO;
import com.blog.project.board.model.BoardVO;

@Service

public class BoardServiceImpl implements BoardService{
	@Inject
	private BoardDAO boardDAO;
	
	public List<BoardVO> getBoardList() throws Exception{
		return boardDAO.getBoardList();
	}

}
