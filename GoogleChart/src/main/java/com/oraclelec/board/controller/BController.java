package com.oraclelec.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oraclelec.board.command.BCommand;
import com.oraclelec.board.command.BListCommand;

@Controller
public class BController {

	BCommand command;
	
	/*Table 만 확인 할 예정 */
	@RequestMapping("/list")
	public String list(Model model)
	{
		
		System.out.println("list()");
		command = new BListCommand();
		command.execute(model);
		return "list";	
	}
	
	
	
	
	
}
