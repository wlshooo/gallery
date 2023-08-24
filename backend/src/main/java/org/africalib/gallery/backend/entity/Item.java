package org.africalib.gallery.backend.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String imgPath;

    @Column
    private int discountPer;

    @Column
    private int price;
}
