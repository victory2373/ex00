package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.ProductVO;

/*
 * ������� ��� �����͸� �����ؾ� �ϴ� ���
 * 
 */
@Controller
public class SampleController3 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	@RequestMapping("/doD")
	public String doD(Model model) {
		
		ProductVO product = new ProductVO("Sample product", 10000);
		
		logger.info("doD");

		/*
		 * addAttribute("�̸�", ��ü): ��ü�� Ư���� �̸��� �ο��� �信�� �̸����� �̿��Ͽ� ��ü ó��
		 * addAttribute(��ü): �̸��� �������� �ʴ� ��쿡�� �ڵ����� ����Ǵ� ��ü�� Ŭ������ �� ���ڸ� �ҹ��ڷ� ó���� Ŭ�������� �̸����� ����
		 */
		model.addAttribute(product);
		
		return "productDetail";
	}
}