package com.webshop.webshop.repo;

import com.webshop.webshop.models.Categoriesgoods;
import com.webshop.webshop.models.Coments;
import org.springframework.data.repository.CrudRepository;

public interface ComentsRepository extends CrudRepository<Coments,Long> {
}
