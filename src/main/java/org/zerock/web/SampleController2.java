package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * String이 리턴 타입인 경우
 * 리턴 타입이 뭄ㄴ자열인 경우라면 결과는 '문자열 + .jsp' 파일을 찾아서 실행한다.
 */
@Controller
public class SampleController2 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg") String msg) {
		
		logger.info("doC called.....");
		
		return "result";
	}
}
