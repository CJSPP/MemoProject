package com.sparta.memoproject.dto;

import lombok.Getter;

@Getter
public class MemoRequestDto {

    //제목   
    private String title;
    //작성자명    
    private String name;
    //비밀번호
    private String password;
    //작성 내용
    private String comment;
}
