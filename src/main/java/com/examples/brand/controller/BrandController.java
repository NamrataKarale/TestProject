package com.examples.brand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.examples.brand.model.Brand;
import com.examples.brand.service.BrandService;
import com.examples.category.service.CategoryService;

public class BrandController {

	@Autowired
	BrandService brandService;
	@Autowired 
	CategoryService catService;
	
	@GetMapping("/brands")
	public List<Brand> listAllBrand(){
		return brandService.findAll();
		
	}
	@PostMapping("/brands")
	public Brand newBrand(@RequestBody Brand newBrand) {
		return brandService.save(newBrand);
		
	}
	@PostMapping("/brands/add")
	public Brand save(@RequestBody Brand brand) {
		return brandService.save(brand);
		
	}
	@DeleteMapping("/brands/{id}")
	public Brand deleteBrand(@PathVariable Integer id) {
		return brandService.deleteById(id);
	}
}
 