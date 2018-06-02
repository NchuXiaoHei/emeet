package com.xiaohei.controller;

import static org.junit.Assert.*;
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
public class Ch_UsersControllerTest {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	
	
	@Autowired
	Ch_UsersController Ch_UsersController;
	@Autowired
	ServletContext context;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(Ch_UsersController).build();
	}
	
	@Test
	public void testCh_users() throws Exception {
		assertNotNull(mockMvc);
		mockMvc.perform((post("/ch_users"))
				.param("hy_id", "1")
				)
		.andExpect(status().isOk())
		.andDo(print());
	}
	
	@Test
	public void testAdd_ch_user() throws Exception {
		assertNotNull(mockMvc);
		mockMvc.perform((post("/add_ch_user"))
				.param("hy_id", "1")
				.param("user_id", "15201233")
				.param("type", "普通")
				)
		.andExpect(status().isOk())
		.andDo(print());
	}

}
