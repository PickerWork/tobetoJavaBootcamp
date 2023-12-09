package com.tobeto.springProject.entities;

import jakarta.persistence.*;
@Entity //Entity olduğunu belirtir
@Table(name = "cars") //Gerekli table bağlanma

public class Car {
    @Id //id olduğunu işaretleme
    @Column(name="id") // Db deki gerekli kolonun ismi
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Üretilen değeri burada tanımlıyoruz. stratejimizi üretim türümüze göre değiştiriyoruz.
    private int id;
    @Column(name="color")
    private String color;
    @Column(name="fuel_type")
    private String fuelType;

    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;
}
