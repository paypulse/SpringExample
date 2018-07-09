package com.oraclelec.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public class BContentCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		Map<String,Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("requet");
		
		//클릭한 글의 내용을 BID로 뽑아 올 예정 
		String bid = request.getParameter("bid");
		
		
		
		
		
		

	}

}
