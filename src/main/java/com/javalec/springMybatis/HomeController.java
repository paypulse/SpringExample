package com.javalec.springMybatis;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javalec.springMybatis.dao.IDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
/*	ContentDao dao;
	
	*/
	@Autowired
	private SqlSession sqlsession;
	
	
/*	@Autowired
	public void setDao(ContentDao dao) {
		this.dao = dao;
	}
	*/
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
	
	
	@RequestMapping("/listChart")
	public String listChart(Model model) {
		//ArrayList<ContentDto> dtos = dao.listDao();
		
		IDao dao = sqlsession.getMapper(IDao.class);
		model.addAttribute("listChart", dao.listChartDao());
		
		return "/listChart";
	}
	
	
	@RequestMapping("/optionChart")
	public String optionChart(HttpServletRequest request,Model model) {
		
		IDao dao = sqlsession.getMapper(IDao.class);
		System.out.println("selectlist:" + request.getParameter("selectlist"));
		System.err.println("datagk:" + request.getParameter("datagk"));
		System.out.println("areacode1:" + request.getParameter("areacode1"));
		System.out.println("areacode2:" + request.getParameter("areacode2"));
		System.out.println("areacode3:" + request.getParameter("areacode3"));
		System.out.println("areacode4:" + request.getParameter("areacode4"));
		System.out.println("areacode5:" + request.getParameter("areacode5"));
		System.out.println("areacode6:" + request.getParameter("areacode6"));
		System.out.println("areacode7:" + request.getParameter("areacode7"));
		System.out.println("areacode8:" + request.getParameter("areacode8"));
		System.out.println("orderdata:" + request.getParameter("orderdata"));
		System.out.println("cntdata:" + request.getParameter("cntdata"));
		
		
		model.addAttribute("optionChart",dao.optionChartDao(request.getParameter("selectlist"),
				   request.getParameter("datagk"), 
				   request.getParameter("areacode1"),
				   request.getParameter("areacode2"), 
				   request.getParameter("areacode3"),
				   request.getParameter("areacode4"),
				   request.getParameter("areacode5"),
				   request.getParameter("areacode6"),
				   request.getParameter("areacode7"),
				   request.getParameter("areacode8"),
				   request.getParameter("orderdata"),
				   request.getParameter("cntdata")));
		
		
		return "/optionChart";
	}
}