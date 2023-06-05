package com.webshop.webshop.repo;

import com.webshop.webshop.models.Categoriesgoods;
import com.webshop.webshop.models.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers,Long> {
}
