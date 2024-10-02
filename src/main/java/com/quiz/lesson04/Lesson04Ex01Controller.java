package com.quiz.lesson04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/lesson04/quiz01")
@Controller
public class Lesson04Ex01Controller {

	@RequestMapping(path = "/add-seller-view" , method = RequestMethod.GET)
	public String addUserView() {
		return "lesson04/addUser"; // HTML의 경로
	}
}
