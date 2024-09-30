package com.quiz.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson02.bo.StoreBO;
import com.quiz.lesson02.domain.Store;

@RestController // @Controller + @ResponseBody
public class Lesson02Quiz01RestController {

	@Autowired // DI 
	private StoreBO storeBO; // 은닉화는 관례적으로 넣어줌 / storeBO 헷갈리지 않게 소문자로  
	
	// http://localhost/lesson02/quiz01
	@RequestMapping("/lesson02/quiz01")
	public List<Store> quiz01() {
		return storeBO.getStoreList(); // list json => response
	}
}
