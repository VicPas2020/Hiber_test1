package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepo extends JpaRepository<Shop, Long> {



    Shop findShopByBrand(String brand);

}
