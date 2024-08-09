package com.whiskey.domain.entity.report;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import com.whiskey.domain.entity.review.ReviewComment;

@Table(name = "tbl_review_comment_report")
@Entity
public class ReviewCommentReport extends Report {
    @ManyToOne
    @JoinColumn(name = "review_comment_id")
    private ReviewComment reviewComment;
}