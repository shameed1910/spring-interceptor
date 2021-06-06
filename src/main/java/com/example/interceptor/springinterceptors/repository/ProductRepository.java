package com.example.interceptor.springinterceptors.repository;

import com.example.interceptor.springinterceptors.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
