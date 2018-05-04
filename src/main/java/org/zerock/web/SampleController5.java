package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;

/*
 * JSON �����͸� �����ϴ� ���
 * pom.xml�� jackson-databind ���̺귯���� �߰������ �Ѵ�.
 * @ResponseBody �ֳ����̼��� �߰��Ѵ�.
 */

@Controller
public class SampleController5 {

	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() {	// ����Ÿ�Կ� @ResponseBody �ֳ����̼��� �߰��Ѵ�.
		
		ProductVO vo = new ProductVO("���û�ǰ", 3000);
		
		return vo;	// ��ü�� JSON���·� ��ȯ�ؼ� ��ȯ�Ѵ�.
	}
}
