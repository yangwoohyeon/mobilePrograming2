package com.example.demo12.model;


import javax.persistence.*;

@Entity
@Table(name="member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //필드값을 DB가 자동 생성
    @Column(name = "NUM")
    private long num;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 20)
    private String id;

    @Column(nullable = false, length = 12)
    private String phone;

    @Column(nullable = false, unique = true) //unique=true ==> 고유해야 한다. 중복값 허용 X
    private String email;

}