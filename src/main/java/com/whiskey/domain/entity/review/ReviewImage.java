package com.whiskey.domain.entity.review;

import com.whiskey.domain.entity.resource.ImageFile;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Table(name = "review_image")
@Entity
public class ReviewImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;    // 리뷰 이미지 식별자

    @ManyToOne
    @JoinColumn(name = "review_id", nullable = false)
    private Review review;  // 리뷰

    @ManyToOne
    @JoinColumn(name = "image_file_id", nullable = false)
    private ImageFile imageFile;    // 이미지파일
}
