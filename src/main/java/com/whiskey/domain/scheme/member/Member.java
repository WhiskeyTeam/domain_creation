package com.whiskey.domain.scheme.member;

import com.whiskey.domain.scheme.resource.ImageFile;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Table(name = "tbl_member")
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // 회원 식별자

    @Column(nullable = false)
    private String name;    // 이름

    @Column(nullable = false)
    private String nickname;    // 닉네임

    @Column(nullable = false, unique = true)    // 중복 방지
    private String loginId; // 로그인 아이디 -> 기본 로그인, 소셜로그인

    @Column(nullable = false)
    private String email;   // 이메일

    private String password;    // 비밀번호

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime createdAt;   // 생성 시점에 현재 시간 초기화

    private LocalDateTime deletedAt;   // 삭제 시점에 현재 시간 초기화

    @Column(nullable = false)
    private boolean isActive;   // 활성화/비활성화

    @OneToOne
    @JoinColumn(name = "image_file_id")
    private ImageFile imageFile;    // 프로필 사진

    @Enumerated(EnumType.STRING)
    @Column(name = "login_type", nullable = false)
    private LoginType loginType;    // 로그인 타입

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;    // 권한
}
