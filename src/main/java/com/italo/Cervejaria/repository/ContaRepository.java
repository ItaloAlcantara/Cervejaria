package com.italo.Cervejaria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.italo.Cervejaria.model.Conta;

@Repository
@Transactional
public interface ContaRepository extends CrudRepository<Conta, Long> {

}
