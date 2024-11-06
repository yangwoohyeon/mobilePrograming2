package com.example.demo12.dto;

import com.example.demo12.model.Member;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class MemberDTO {
    private long num;
    private String name;
    private String id;
    private String phone;
    //Lombok 사용으로 게터 세터 생략 가능
    //NoArgsConstructor 사용으로 생성자 자동 생성
}
