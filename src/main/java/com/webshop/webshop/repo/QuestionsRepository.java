package com.webshop.webshop.repo;

import com.webshop.webshop.models.Categoriesgoods;
import com.webshop.webshop.models.Questions;
import org.springframework.data.repository.CrudRepository;

public interface QuestionsRepository extends CrudRepository<Questions,Long> {
}
