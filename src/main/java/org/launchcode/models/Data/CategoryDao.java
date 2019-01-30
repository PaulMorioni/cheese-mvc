package org.launchcode.models.Data;

import org.launchcode.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDao extends CrudRepository<Category, Integer> {

}
