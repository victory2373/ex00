package org.zerock.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/*
 * @RunWith, @ContextConfiguration �ֳ����̼��� ���� �׽�Ʈ �ڵ带 ������ �� �������� �ε��ǵ��� �ϴ� �κ�
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class SampleControllerTest {

	private static final Logger logger = LoggerFactory.getLogger(SampleControllerTest.class);
	
	@Inject
	private WebApplicationContext wac;
	
	/*
	 * �������� ��û�� ������ �ǹ��ϴ� ��ü�� ����
	 * �Ź� �׽�Ʈ�� ������ ������ ������ ��û�� ������ ó���ϱ� ���ؼ� setup() �޼ҵ忡���� @Before �ֳ����̼����� ó���Ǿ� 
	 * �׽�Ʈ �޼ҵ��� ���� ���� MockMvc ��ü�� ������.
	 */
	private MockMvc mockMvc;	
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		logger.info("setup......");
	}
	
	@Test
	public void testDoA() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/doA"));
	}
}





