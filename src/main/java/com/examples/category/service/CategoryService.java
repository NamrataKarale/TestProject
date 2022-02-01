package com.examples.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.examples.category.model.Category;
import com.examples.category.repository.CategoryRepository;

public class CategoryService {

	@Autowired
	CategoryRepository catrepo;
	public List<Category> findAll() {
		return catrepo.findAll();
	}

	public List<Category> findByName(String name) {
		return catrepo.findByName(name);
	}

	public Category save(Category cat) {
		return catrepo.save(cat);
	}

	

}
