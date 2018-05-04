package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/*
 * 리다이렉트를 해야 하는 경우
 * 특정한 컨트롤러의 로직을 처리할 때 다른 경로를 호출해야 하는 경우 'redirect:'를 이용한다.
 * 리다이렉트를 하는 경우 RedirectAttribute라는 클래스를 파라미터로 사용하게 되면 리다이렉트 시점에 원하는 데이터를 임시로 추가해서 넘기는 작업이 가능하다.
 */
@Controller
public class SampleController4 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr) {	// RedirectAttribute 클래스 선언
		logger.info("doE called but redirected to /doF...............");
		
		// 리다이렉트 시 넘겨줄 데이터를 설정
		rttr.addFlashAttribute("msg", "This is the Message!! with redirected");
		
		return "redirect:/doF";
	}
	
	@RequestMapping("/doF")
	public void doF(@ModelAttribute("msg") String msg) {	// ModelAttribute를 사용해서 넘어온 데이터를 받는다.
		
		logger.info("doF called..........." + msg);
	}
	
}
