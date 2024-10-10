package com.quiz.lesson04.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.quiz.lesson04.domain.Seller;

@Mapper  // MyBatis 매퍼 인터페이스임을 나타냄
public interface SellerMapper {

    // input : 닉네임, 프로필 URL, 온도
    // output : 성공한 행의 개수 (int) 

    // 판매자 정보를 DB에 삽입하는 메소드 마이바티스가 제공 
    public int insertSeller(
            @Param("nickname") String nickname,  // DB에 삽입할 판매자의 닉네임
            @Param("profileImageUrl") String profileImageUrl,  // DB에 삽입할 판매자의 프로필 이미지 URL
            @Param("temperature") double temperature);  // DB에 삽입할 판매자의 온도 (신뢰도)

    // input: X 
    // output: seller  
    public Seller selectLatestSeller();

    public Seller selectSellerById(int id);

}
