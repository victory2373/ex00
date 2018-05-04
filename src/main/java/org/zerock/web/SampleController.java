package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * void 리턴 타입인 경우
 * 리턴 타입이 void인 경우에는 현재 경로에 해당하는 JSP파일을 실행하게 된다.
 */
@Controller
public class SampleController {

	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("doA")
	public void doA() {
		logger.info("doA called........");
	}
	
	@RequestMapping("doB")
	public void doB() {
		logger.info("doB called........");
	}
}
