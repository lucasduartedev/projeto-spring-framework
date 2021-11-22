package com.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.models.Entrega;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {

}
