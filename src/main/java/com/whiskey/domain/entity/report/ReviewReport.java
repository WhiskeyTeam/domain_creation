package com.whiskey.domain.entity.report;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import com.whiskey.domain.entity.review.Review;

@Table(name = "tbl_review_report")
@Entity
public class ReviewReport extends Report {
    @ManyToOne
    @JoinColumn(name = "review_id")
    private Review review;
}