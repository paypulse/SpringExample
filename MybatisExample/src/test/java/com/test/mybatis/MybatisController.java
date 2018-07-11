package com.test.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/*컨트롤러 부분으로서 DB로 부터 가져운 값을 view 화면으로 보내 준다. */
import java.util.List;
import java.util.Locale;
 
import javax.servlet.http.HttpServletRequest;
 

import org.slf4j.Logger;
import org.slf4j.ILoggerFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
import com.test.mybatis.Member;
import com.test.mybatis.MemberDAOService;



@Controller
public class MybatisController {
	
	@Autowired
	private MemberDAOService memberDAOService;
	
	@Autowired
	private SqlSession sqlSession;
	
	//시작 메인 화면
	
	//@RequestMapping("/main")
	@RequestMapping("/result") 
	public ModelAndView main(Locale locale, Model model) {
	//view 화면인 main.jsp에 DB로 부터 읽어온 데이터를 보여준다. 
		ModelAndView result = new ModelAndView();
		//addObject view에 넘어가는 데이터
		List<Member> memberList = memberDAOService.getMembers();
		result.addObject("result",memberList);
		//result.setViewName("main");
		result.setViewName("result");
		return result;
		
	}
	
	/*
	//insert 버튼 클릭시 값을 가져와서 result.jsp로 화면 전환 해준다. 
	@RequestMapping(value="/insert", method = RequestMethod.POST)
	public  ModelAndView insert(HttpServletRequest request) {
		
		//HttpServletRequest를 이용하여 main.jsp 로 부터 값을 가져온다. getParameter로는 id 값을 가져옴
		Member member = new Member();
		member.setNM((String) request.getParameter("NM"));
		member.setSCORE(request.getParameter("SCORE"));
		
		memberDAOService.insertMember(member);
		System.out.println("insert complete");
		
		ModelAndView result = new ModelAndView();
		List<Member> memberList = memberDAOService.getMembers();
		result.addObject("result", memberList);
		result.setViewName("result");
		return result;
			
	}*/
	
	
}
