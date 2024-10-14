package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson04.bo.RealtorBO;
import com.quiz.lesson04.domain.Realtor;

@Controller
@RequestMapping("/lesson04/quiz02")
public class Lesson04Quiz02Controller {

	
	@Autowired
	private RealtorBO realtorBO; 
	
	// 추가 확인
	// http://localhost:8080/lesson04/quiz02/add-realtor-view
	@GetMapping("/add-realtor-view") 
	public String addRealtorView() {
		return "lesson04/addRealtor";
	}
	
	// 공인 중개사 추가 방금 추가한 중개사
	@PostMapping("/add-realtor")
	public String addRealtor(
			@ModelAttribute Realtor realtor,
			Model model) {
		
	// DB insert
	realtorBO.addRealtor(realtor);
		
	// DB Select	
	Realtor latestRealter = realtorBO.selectRealtorById(realtor.getId());
		
	// model
	model.addAttribute("Realter",latestRealter);
	
	// View 
	return "lesson04/afterAddRealtor";
	
	}
}
