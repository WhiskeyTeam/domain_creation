package com.whiskey.domain.scheme.restreg;

import com.whiskey.domain.scheme.geo.Address;
import com.whiskey.domain.scheme.member.Member;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Table(name = "tbl_restaurant_registration_application")
@Entity
public class RestaurantRegistrationApplication {
    // TODO: 입점 신청서
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;    // 식별자

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;  // 회원

    @Column(name = "restaurant_name")
    private String restaurantName;  // 음식점 이름

    @ManyToOne
    @JoinColumn(name = "restaurant_address")
    private Address restaurantAddress;  // 음식점 주소

    @Column(nullable = false)
    private String number;  // 음식점 전화번호

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;    // 생성 시점에 현재 일시로 초기화

    @Column(name = "is_approved")
    private boolean isApproved;  // default is false
}