package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/test01")
	public String test01(){

		System.out.println("1111");
		return "success";
	}
	@RequestMapping("/test02")
	public ModelAndView test02(ModelAndView modelAndView){

		System.out.println("222");
//		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("success");
		return modelAndView;
	}
	@RequestMapping("/test03")
	public void test03(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("3333");
		request.getRequestDispatcher("/pages/success.jsp").forward(request,response);
//		response.sendRedirect("/springmvc_day01_01/pages/success.jsp");
	}
	//携带数据
	@RequestMapping("/test04")
	public ModelAndView test04(ModelAndView modelAndView){

		System.out.println("444");
		modelAndView.addObject("username","admin");
		modelAndView.setViewName("success");
		return modelAndView;
	}
	//携带数据
	@RequestMapping("/test05")
	public String test05(Model model){

		System.out.println("555");
		model.addAttribute("username","admin");

		return "success";
	}
	//携带数据
	@RequestMapping("/test06")
	public String test06(Map map){

		System.out.println("666");
		map.put("username","itcast");

		return "success";
	}
	@RequestMapping("/test07")
	public String test07(HttpServletRequest request, HttpSession session){

		System.out.println("777");
		request.setAttribute("username","itheima");
		request.getSession().setAttribute("username","session");
		session.setAttribute("username","session01");
		return "success";
	}
}
