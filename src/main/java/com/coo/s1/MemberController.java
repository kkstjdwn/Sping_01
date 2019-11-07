package com.coo.s1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.coo.s1.member.MemberDTO;

@Controller
@RequestMapping("member/**")
public class MemberController {
	//회원가입, 로그인, 로그아웃, 회원수정, 탈퇴
	
	/**
	 * 회원가입
	 * 	가입폼
	 * 		URL : /member/memberJoin	: GET
	 * 		JSP : /WEB-INF/views/member/memberJoin.jsp
	 * 	결과
	 * 		URL	: /member/memberJoin	: POST
	 * 		JSP	: alert 성공/실패 --> /home.jsp	--> redirect
	 * 로그인
	 * 	입력폼
	 * 		URL	: /member/memberLogin	: GET
	 * 		JSP	: /WEB-INF/views/member/memberLogin.jsp
	 * 	결과
	 * 		URL	: /member/memberLogin	: POST
	 * 		JSP	: 성공시 --> /home.jsp		실패시 --> 로그인 실패시 로그인 폼으로 이동
	 */

	//join - GET
	@RequestMapping(value = "memberJoin", method = RequestMethod.GET)
	public void join() {
		
	}
	
	//join - POST
	@RequestMapping(value = "memberJoin", method = RequestMethod.POST)
	public ModelAndView join(MemberDTO memberDTO) {
		ModelAndView mv = new ModelAndView();
		String msg = "가입실패";
		String path = "/s1";
		if (memberDTO.getName().equals("1")) {
			msg = "가입성공";
		}
		mv.addObject("msg", msg);
		mv.addObject("path", path);
		mv.setViewName("common/common_result");
		
		return mv;
	}
	
	//Login - GET
	@RequestMapping(value = "memberLogin", method = RequestMethod.GET)
	public void login() {
		
	}
	
	//Login - POST
	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
	public ModelAndView login(MemberDTO memberDTO) {
		ModelAndView mv = new ModelAndView();
		String msg = "로그인 실패";
		String path = "/s1";
		if (memberDTO.getId().equals("q")) {
			msg = "로그인 성공";
		}
		
		mv.addObject("msg", msg);
		mv.addObject("path", path);
		mv.setViewName("common/common_result");
		
		return mv;
	}
	
}
