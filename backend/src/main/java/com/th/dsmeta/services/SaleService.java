package com.th.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.th.dsmeta.entities.Sale;
import com.th.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository Repository;
	public List<Sale> findSales() {
		return Repository.findAll();
	}

}
