package com.quiz.lesson04.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.lesson04.domain.Realtor;

@Mapper
public interface RealtorMapper {
	
	// intput: realtor
	// output: int or void
	
	public void insertRealtor(Realtor realtor);
		
	// input: int(id)  
	// output: realtor
	
	public Realtor selectRealtorById(int id);
	
}
