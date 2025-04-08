package com.reservasHotel.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservasHotel.apirest.models.entity.Cliente;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
