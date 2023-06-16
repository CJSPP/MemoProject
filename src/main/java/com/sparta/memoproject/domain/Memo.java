package com.sparta.memoproject.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sparta.memoproject.dto.MemoRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Memo extends TimeStamp {

    //Id에 의해 조회, 검색, 삭제하기
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    //제목
    @Column(nullable = false)
    private String title;

    //작성자명
    @Column(nullable = false)
    private String name;

    //비밀번호
    @Column(nullable = false)
    //JSON 변환 과정에서 제외되어 조회 시, 보이지 않는다.
    @JsonIgnore
    private String password;

    //작성 내용
    @Column(nullable = false)
    private String comment;

    public Memo(MemoRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.name = requestDto.getName();
        this.password = requestDto.getPassword();
        this.comment = requestDto.getComment();
    }

    public void update(MemoRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.name = requestDto.getName();
        this.password = requestDto.getPassword();
        this.comment = requestDto.getComment();
    }
}
