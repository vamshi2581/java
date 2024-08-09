package com.org.microjdbc.jdbc.repository;

import org.springframework.data.repository.CrudRepository;

import com.org.microjdbc.jdbc.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>  {

}
