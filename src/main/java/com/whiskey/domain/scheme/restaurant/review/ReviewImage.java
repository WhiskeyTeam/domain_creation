package com.whiskey.domain.scheme.restaurant.review;

import com.whiskey.domain.scheme.resource.ImageFile;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Table(name = "review_image")
@Entity
public class ReviewImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "review_id", nullable = false)
    private Review review;

    @ManyToOne
    @JoinColumn(name = "image_file_id", nullable = false)
    private ImageFile imageFile;
}
