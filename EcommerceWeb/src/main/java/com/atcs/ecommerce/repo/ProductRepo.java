package com.atcs.ecommerce.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atcs.ecommerce.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{


}
