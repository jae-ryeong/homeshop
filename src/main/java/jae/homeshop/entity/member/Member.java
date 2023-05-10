package jae.homeshop.entity.member;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
public class Member {
    // 관리자인지 일반 유저인지, 등급

    @Id @GeneratedValue
    private Long MemberId;

    @Column(name = "Member_Name")
    private String name;

    private int age;

    @Email(message = "이메일 형식으로 입력해야합니다.")
    private String email;

    @Enumerated(EnumType.STRING)
    @NotNull
    private MemberGrade grade;


}
