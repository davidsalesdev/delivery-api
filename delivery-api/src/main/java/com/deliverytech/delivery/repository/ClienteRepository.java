package com.deliverytech.delivery.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deliverytech.delivery.model.Cliente;
import java.util.List;


@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Long>{

    Optional<Cliente> findByEmail(String email);
    List<Cliente> findbyAtivoTrue(boolean ativo);
    
}
