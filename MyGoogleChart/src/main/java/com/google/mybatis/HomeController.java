package com.google.mybatis;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.mybatis.dao.IDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//sqlSession :���� ����, commit, rollback�� ��� �Ǵ� ��ü
	@Autowired
	private SqlSession sqlsession;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	//Model : �����͸� ó�� �ϴ� �κ�
	//View  : ȭ���� ��� �ϴ� �κ�
	//Controller : ��û�� ó�� �ϴ� �κ����� ��� �� ������ ��� ����
	@RequestMapping("/listChart")
	public String listChart(Model model) {
		IDao  dao = sqlsession.getMapper(IDao.class);
		return "/listChart";
	}
	
	
	
	
}
