package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/*
 * �����̷�Ʈ�� �ؾ� �ϴ� ���
 * Ư���� ��Ʈ�ѷ��� ������ ó���� �� �ٸ� ��θ� ȣ���ؾ� �ϴ� ��� 'redirect:'�� �̿��Ѵ�.
 * �����̷�Ʈ�� �ϴ� ��� RedirectAttribute��� Ŭ������ �Ķ���ͷ� ����ϰ� �Ǹ� �����̷�Ʈ ������ ���ϴ� �����͸� �ӽ÷� �߰��ؼ� �ѱ�� �۾��� �����ϴ�.
 */
@Controller
public class SampleController4 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr) {	// RedirectAttribute Ŭ���� ����
		logger.info("doE called but redirected to /doF...............");
		
		// �����̷�Ʈ �� �Ѱ��� �����͸� ����
		rttr.addFlashAttribute("msg", "This is the Message!! with redirected");
		
		return "redirect:/doF";
	}
	
	@RequestMapping("/doF")
	public void doF(@ModelAttribute("msg") String msg) {	// ModelAttribute�� ����ؼ� �Ѿ�� �����͸� �޴´�.
		
		logger.info("doF called..........." + msg);
	}
	
}
