package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;

/*
 * JSON 데이터를 생성하는 경우
 * pom.xml에 jackson-databind 라이브러리를 추가해줘야 한다.
 * @ResponseBody 애노테이션을 추가한다.
 */

@Controller
public class SampleController5 {

	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() {	// 리턴타입에 @ResponseBody 애노테이션을 추가한다.
		
		ProductVO vo = new ProductVO("샘플상품", 3000);
		
		return vo;	// 객체를 JSON형태로 변환해서 반환한다.
	}
}
