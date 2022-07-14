package com.th.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.th.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
