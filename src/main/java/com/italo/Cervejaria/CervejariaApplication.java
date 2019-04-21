package com.italo.Cervejaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.italo.Cervejaria.model.Categoria;
import com.italo.Cervejaria.model.Cerveja;
import com.italo.Cervejaria.model.Tipo;

@SpringBootApplication
@EntityScan(basePackages = "com.italo.Cervejaria.model")
@EnableTransactionManagement 
//@EnableJpaRepositories(basePackages = {"com.italo.Cervejaria.repository"} ) Usar quando O Spring não reconhecer o Repository
//@ComponentScan(basePackages = {"com.italo.*"}) Usa caso o Spring não detect os meus controller
public class CervejariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CervejariaApplication.class, args);

	}

}
