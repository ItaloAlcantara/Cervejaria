package com.italo.Cervejaria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.italo.Cervejaria.model.Pedido;

@Repository
@Transactional
public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
