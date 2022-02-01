package com.examples.brand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.examples.brand.model.Brand;
import com.examples.brand.repository.BrandRepository;

public class BrandService {
	
	@Autowired
	BrandRepository brandRepo;

	public List<Brand> findAll() {
		return brandRepo.findAll();
	}

	public Brand save(Brand newBrand) {
		return brandRepo.save(newBrand);
	}

	public Brand deleteById(Integer id) {
		return null;
	}

}
