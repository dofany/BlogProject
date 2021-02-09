package com.blog.project.board.service;

import java.util.List;

import com.blog.project.board.model.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getBoardList() throws Exception;

}
