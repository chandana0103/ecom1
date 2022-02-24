package com.abc.ecom1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.ecom1.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
