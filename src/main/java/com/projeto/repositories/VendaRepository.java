package com.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.models.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

}
