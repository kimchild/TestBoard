package com.board.com.board.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.com.board.Domain.Repository.BoardRepository;

@Controller
public class MainController {
	
//	@Autowired
//	BoardRepository boardRepository;
	
	
	@RequestMapping(path = "/")
	public String index() {
		
		return "redirect:/board/";
	}

}
