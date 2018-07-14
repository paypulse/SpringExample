package com.test.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/*��Ʈ�ѷ� �κ����μ� DB�� ���� ������ ���� view ȭ������ ���� �ش�. */
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
	
	//���� ���� ȭ��
	
	//@RequestMapping("/main")
	@RequestMapping("/result") 
	public ModelAndView main(Locale locale, Model model) {
	//view ȭ���� main.jsp�� DB�� ���� �о�� �����͸� �����ش�. 
		ModelAndView result = new ModelAndView();
		//addObject view�� �Ѿ�� ������
		List<Member> memberList = memberDAOService.getMembers();
		result.addObject("result",memberList);
		//result.setViewName("main");
		result.setViewName("result");
		return result;
		
	}
	
	/*
	//insert ��ư Ŭ���� ���� �����ͼ� result.jsp�� ȭ�� ��ȯ ���ش�. 
	@RequestMapping(value="/insert", method = RequestMethod.POST)
	public  ModelAndView insert(HttpServletRequest request) {
		
		//HttpServletRequest�� �̿��Ͽ� main.jsp �� ���� ���� �����´�. getParameter�δ� id ���� ������
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
