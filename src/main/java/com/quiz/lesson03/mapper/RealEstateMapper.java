package com.quiz.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.lesson03.domain.RealEstate;

@Mapper
public interface RealEstateMapper {

	// input : id(int)
	// output : RealEstate(DTO)
	public RealEstate selectRealEstateById(int id);


	// input : int(rentPrice)
	// output : List<RealEstate>
	public List<RealEstate> selectRealEstateListByRentPrice(Integer rentPrice);
	
	// input : map
	// output : List<RealEstate>
	// 파라미터 2개 이상은 xml로 보낼 수 없다. 
	// 하나의 맵으로 구성해야 하는데, @Param이 맵으로 만들어준다.
	public List<RealEstate> selectRealEstateListByAreaPrice(
			@Param("area") int area, 
			@Param("price") int price);
	
	// input : RealEstate
	// output : int(성공)
	public int insertRealEstate(RealEstate RealEstate);
	
	// input: 여러 파라미터
	// output: int 
	public int insertRealEstateAsField(
			@Param("realtorId") int realtorId,
			@Param("address") String address,
			@Param("area") int area,
			@Param("type") String type,
			@Param("price") int price,
			@Param("rentPrice") Integer rentPrice);
	
	// input : id ,price, type
	// output : int  
	
	public int updateRealEstateById(
			@Param("id") int id,
			@Param("type") String type,
			@Param("price") int price);
	
	// input : id
	// output : int 
	
	public int deleteRealEstateById(int id); 
	
}
