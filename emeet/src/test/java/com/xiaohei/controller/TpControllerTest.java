package com.xiaohei.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.servlet.ServletContext;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextConfiguration({"classpath*:mvc-dispatcher-servlet.xml","classpath*:applicationContext*.xml","classpath*:applicationContext-service.xml"})

//����ع�
@TransactionConfiguration(defaultRollback = true)  
@Transactional
public class TpControllerTest {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	
	
	@Autowired
	TpController tpController;
	@Autowired
	ServletContext context;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(tpController).build();
	}
	
	@Test
	public void testVoteUp() throws Exception {
		assertNotNull(mockMvc);
		mockMvc.perform((post("/vote_up"))
				.param("hy_id", "2")
				.param("note", "投票测试")
				)
		.andExpect(status().isOk())
		.andDo(print());
	}
	
	@Test
	public void testVoteDown() throws Exception {
		assertNotNull(mockMvc);
		mockMvc.perform((get("/voteDown"))
				.param("hy_id", "2")
				.param("tp_id", "1")
				)
		.andExpect(status().isOk())
		.andDo(print());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
