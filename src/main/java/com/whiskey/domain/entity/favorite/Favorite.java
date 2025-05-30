package com.whiskey.domain.entity.favorite;

import com.whiskey.domain.entity.member.Member;
import com.whiskey.domain.entity.restaurant.Restaurant;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Table(name = "tbl_favorite")
@Entity
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;    // 즐겨찾기 식별자

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;  // 즐겨찾기 추가한 회원

    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;  // 즐겨찾기에 추가된 음식점
}
