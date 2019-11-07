package com.coo.s1;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.tags.Param;

import com.coo.notice.NoticeDTO;
import com.coo.notice.NoticeService;

@Controller
@RequestMapping("notice/**")
public class NoticeController {
	@Inject
	private NoticeService service;
	
	/** 일반 멤버 메서드를 작성*/
	
	//리스트
	@RequestMapping("noticeList") //서버 내에선 / 까지가 루트의 경로
	public ModelAndView noticeList() throws Exception{
		List<NoticeDTO> ar = service.noticeList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", ar);
		mv.setViewName("notice/noticeList");
		
		return mv;
	}
	
	//selectOne
	@RequestMapping(value = "noticeSelect", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView noticeSelect(int num) throws Exception {
		NoticeDTO noticeDTO = service.selectOne(num);
		ModelAndView mv = new ModelAndView();
		mv.addObject("dto", noticeDTO);
		mv.setViewName("notice/noticeSelect");
		
		return mv;
	}
	
	//write - GET
	@RequestMapping(value = "noticeWrite",method = RequestMethod.GET)
	public String noticeWrite() {
		
		return "notice/noticeWrite";
	}
	@RequestMapping(params = {"id=q, name=1 ,age"})
	public void testing() {
		
	}
	
	//write - POST
	@RequestMapping(value = "noticeWrite",method = RequestMethod.POST)
	public ModelAndView noticeWrite(NoticeDTO noticeDTO) throws Exception{ //오버로딩
			int result = service.insert(noticeDTO);
			String msg = "작성 실패";
			String path = "notice/noticeList";
			if (result>0) {
				msg = "작성 성공";
			}
			ModelAndView mv = new ModelAndView();
			mv.addObject("msg", msg);
			mv.addObject("path", path);
			mv.setViewName("common/common_result");
		
		return mv;
		
	}
}
