package com.coo.s1;

import static org.junit.Assert.*;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class DataSourceTest extends TestAbstractCase {

	@Inject
	private SqlSession sqlSession;
	
	@Test
	public void test() throws Exception{
		assertNotNull(sqlSession);
	}

}
