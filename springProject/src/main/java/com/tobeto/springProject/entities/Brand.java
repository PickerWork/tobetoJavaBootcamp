package com.tobeto.springProject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "brand") //attribute ismi
    @JsonIgnore //Bu alan jsona parse edilirken yok sayar sonsuz döngüyü kırar ****şu anlık çözüm dto varsa kullanmaya gerek yok
    private List<Car> cars;
}
