package com.tn.isamm.boutiquebackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tn.isamm.boutiquebackend.dao.CategoryDAO;
import com.tn.isamm.boutiquebackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("thisjhhvhbhhhgvhhghg");
		category.setImageURL("nahed.jpg");
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("thisjhhvhbhhhgvhhghg");
		category.setImageURL("nahed.jpg");
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("thisjhhvhbhhhgvhhghg");
		category.setImageURL("nahed.jpg");
		categories.add(category);
	}


	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
	
		for(Category category : categories) {
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
