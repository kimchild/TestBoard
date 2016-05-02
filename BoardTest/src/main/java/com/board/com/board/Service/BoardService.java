package com.board.com.board.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.board.com.board.Domain.Board;

public interface BoardService {
	
	Page<Board> list(Pageable pageable);

}
