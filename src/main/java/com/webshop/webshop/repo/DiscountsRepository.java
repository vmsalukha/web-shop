package com.webshop.webshop.repo;

import com.webshop.webshop.models.Categoriesgoods;
import com.webshop.webshop.models.Discounts;
import org.springframework.data.repository.CrudRepository;

public interface DiscountsRepository extends CrudRepository<Discounts,Long> {
}
