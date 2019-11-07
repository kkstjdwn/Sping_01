package com.coo.s1.notice;

import java.util.List;

public class NoticeService {
	
	private NoticeDAO dao;
	

	
	public void setDao(NoticeDAO dao) {
		this.dao = dao;
	}

	public List<NoticeDTO> noticeList() throws Exception{
		
		List<NoticeDTO> ar = dao.noticeList();
		
		return ar;
	}
	
	public NoticeDTO selectOne(int num) throws Exception{
		
		NoticeDTO noticeDTO = dao.selectOne(num);
		
		return noticeDTO;
	}
	
	public int insert(NoticeDTO dto) throws Exception{
		int result = dao.insert(dto);
		
		
		return result;
		
	}
}
