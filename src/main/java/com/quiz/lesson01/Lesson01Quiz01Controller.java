package com.quiz.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson01/quiz01")
public class Lesson01Quiz01Controller {

	@ResponseBody // + return String => HTML
	@RequestMapping("/1")
	public String quiz01_1 () {
		return "<h2>테스트 프로젝트 완성</h2><h3>"
				+ "해당 프로젝트를 통해 문제풀이를 진행 합니다.</h3>";
	}
	
	@ResponseBody // + Map => JSON
	@RequestMapping("/2")
	public Map<String, Object> quiz_02() {
	Map<String, Object> map = new HashMap<>();
	
	map.put("국어", 80);
	map.put("수학", 90);
	map.put("영어", 85);
	
	return map; // map => JSON String 
	
	}
}
