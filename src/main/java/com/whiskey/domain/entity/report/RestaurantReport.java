package com.whiskey.domain.entity.report;

import com.whiskey.domain.entity.restaurant.Restaurant;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Table(name = "tbl_restaurant_report")
@Entity
public class RestaurantReport extends Report {
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
}