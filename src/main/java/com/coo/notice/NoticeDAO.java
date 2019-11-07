package com.coo.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {
	
	@Inject
	private DataSource dataSource;
	
	public List<NoticeDTO> noticeList()throws Exception{
		Connection con = dataSource.getConnection();
		String sql = "select * from notice order by num desc";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();
		
		while (rs.next()) {
			NoticeDTO dto = new NoticeDTO();
			dto.setNum(rs.getInt(1));
			dto.setTitle(rs.getString(2));
			dto.setWriter(rs.getString(3));
			dto.setContents(rs.getString(4));
			dto.setReg_date(rs.getDate(5));
			dto.setHit(rs.getInt(6));
			ar.add(dto);
		}
		rs.close();
		st.close();
		con.close();
		
		
		return ar;
	}
	
	public NoticeDTO selectOne(int num) throws Exception{
		NoticeDTO dto = null;
		
		Connection con = dataSource.getConnection();
		String sql = "select * from notice where num = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, num);
		ResultSet rs = st.executeQuery();
		if (rs.next()) {
			dto = new NoticeDTO();
			dto.setNum(rs.getInt(1));
			dto.setTitle(rs.getString(2));
			dto.setWriter(rs.getString(3));
			dto.setContents(rs.getString(4));
			dto.setReg_date(rs.getDate(5));
			dto.setHit(rs.getInt(6));
			
		}
		
		rs.close();
		st.close();
		con.close();
		
		
		return dto;
	}
	
	public int insert(NoticeDTO dto) throws Exception{
		int result = 0;
		
		String sql = "insert into notice values(not_seq.nextval, ?, ?, ?, sysdate,0)";
		
		Connection con = dataSource.getConnection();
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, dto.getTitle());
		st.setString(2, dto.getWriter());
		st.setString(3, dto.getContents());
		
		result = st.executeUpdate();
		
		
		
		
		
		return result;
	}
}
