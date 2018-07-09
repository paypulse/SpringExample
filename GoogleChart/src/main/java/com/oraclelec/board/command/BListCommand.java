package com.oraclelec.board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.oraclelec.board.dao.BDao;
import com.oraclelec.board.dto.BDto;


public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		
		//modelø° ¿˙¿Â 
		model.addAttribute("list", dtos);
		

	}

}
