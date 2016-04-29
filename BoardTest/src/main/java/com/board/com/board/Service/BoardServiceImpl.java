package com.board.com.board.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.com.board.Domain.Board;
import com.board.com.board.Domain.Repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardRepository boardRepository;
	
	@Override
	public List<Board> list() {
	
		Board board = new Board();
		board.setTitle("제목1");
		board.setContents("내용1");
		boardRepository.save(board);
		
		return boardRepository.findAll();
	}

}
