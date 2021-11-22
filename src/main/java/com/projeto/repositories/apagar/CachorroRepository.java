package com.projeto.repositories.apagar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.models.apagar.Cachorro;

@Repository
public interface CachorroRepository extends JpaRepository<Cachorro, Long> {

}
