package com.examples.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.category.model.Category;
import com.examples.category.service.*;
@RequestMapping
@RestController
public class CategoryController {

	@Autowired
	CategoryService catservice;
	
	@GetMapping("/categories")
	public List<Category> listAllCategory(){
		return catservice.findAll();
	}
	@GetMapping("/categories/{name}")
	public List<Category> listAllByName(@PathVariable("name") String name){
		return catservice.findByName(name);
		
	}
	@PostMapping("/categories/add")
	public Category save(@RequestBody Category cat) {
		return catservice.save(cat);
	}
}
