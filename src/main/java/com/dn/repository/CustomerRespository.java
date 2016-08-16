/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dn.repository;

import com.dn.model.Customer;
import java.util.Optional;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author BPULI
 */
@RepositoryRestResource
@Lazy
public interface CustomerRespository extends JpaRepository<Customer,Long>{
    Optional<Customer> findByName(@Param("name") String name);
}
