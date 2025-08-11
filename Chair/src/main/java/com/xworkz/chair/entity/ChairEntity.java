package com.xworkz.chair.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "chair_info")
public class ChairEntity {

    @Id
    private int id;

    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private int price;

}
