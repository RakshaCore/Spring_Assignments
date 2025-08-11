package com.xworkz.c_namedquery.entity;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "aadhar_info")
@NamedQuery(name="findByName",query="select entity from AadharEntity entity where entity.name=:name")
public class AadharEntity {
    public AadharEntity(@NonNull String name, @NonNull int age, @NonNull long phone, @NonNull String email) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @NonNull
    @Column(name = "name")
    private String name ;

    @NonNull
    @Column(name = "age")
    private int age;

    @NonNull
    @Column(name = "phone_no")
    private long phone;

    @NonNull
    @Column(name = "email")
    private String email;
}
