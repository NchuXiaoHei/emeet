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

import com.xiaohei.controller.MeetStatusController;
import com.xiaohei.controller.UserController;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextConfiguration({"classpath*:mvc-dispatcher-servlet.xml","classpath*:applicationContext*.xml","classpath*:applicationContext-service.xml"})

//����ع�
@TransactionConfiguration(defaultRollback = true)  
@Transactional
public class MeetStatusControllerTest {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	
	
	@Autowired
	MeetStatusController meetStatusController;
	@Autowired
	ServletContext context;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(meetStatusController).build();
	}
	
	@Test
	public void testGetMeetStatus() throws Exception {
		assertNotNull(mockMvc);
		mockMvc.perform((post("/getStatus"))
				.param("hy_id", "1")
				)
		.andExpect(status().isOk())
		.andDo(print());
	}
	
	@Test
	public void testUpdateStatus() throws Exception {
		assertNotNull(mockMvc);
		mockMvc.perform((post("/updateStatus"))
				.param("hy_id", "1")
				.param("hy_status", "进行中")
				)
		.andExpect(status().isOk())
		.andDo(print());
	}

}
