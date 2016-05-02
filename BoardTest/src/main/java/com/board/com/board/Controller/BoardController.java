package com.board.com.board.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
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
	public String list(@PageableDefault(sort = { "createDate" }, direction = Direction.DESC) Pageable pageable, ModelMap modelMap) {
		
		Board board = new Board();
		board.setTitle("제목1");
		board.setContents("내용1");
		
		modelMap.put("objPage", boardService.list(pageable));
		
		return "board/list";
	}

}
