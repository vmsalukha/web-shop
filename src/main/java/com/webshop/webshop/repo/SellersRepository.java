package com.webshop.webshop.repo;

import com.webshop.webshop.models.Categoriesgoods;
import com.webshop.webshop.models.Sellers;
import org.springframework.data.repository.CrudRepository;

public interface SellersRepository extends CrudRepository<Sellers,Long> {
}
