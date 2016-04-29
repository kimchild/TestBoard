package com.board.com.board.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.com.board.Domain.Board;
import com.board.com.board.Service.BoardService;

@Controller
@RequestMapping(path = "/board")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String list(ModelMap modelMap) {
		
		//modelMap.put("list", "list");
		Board board = new Board();
		board.setTitle("제목1");
		board.setContents("내용1");
		boardService.list();
		
		return "board/list";
	}

}
