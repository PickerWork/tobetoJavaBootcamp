package com.tobeto.springProject.repositories;

import com.tobeto.springProject.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

//DATA JPA
//Generic türler reference type olmak zorunda.(Integer,String)
//JPA Extend ediyoruz ve classımızı ve id mizi giriyoruz.
public interface BrandRepository extends JpaRepository<Brand,Integer> {
    //Veritabanında oluşturduğumuz brand entitiesinin veriye erişeceği class
    //Veri erişim katmanı
    //CRUD
}
