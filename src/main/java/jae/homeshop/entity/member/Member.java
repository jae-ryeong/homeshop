package jae.homeshop.entity.member;

import jakarta.persistence.*;

@Entity
public class Member {
    // 관리자인지 일반 유저인지, 등급

    @Id @GeneratedValue
    private Long MemberId;

    @Column(name = "Member_Name")
    private String name;

    private int age;

    private String email;

    @Enumerated(EnumType.STRING)
    private MemberGrade grade;


}
