package com.webshop.webshop.repo;

import com.webshop.webshop.models.Categoriesgoods;
import com.webshop.webshop.models.Goodsorders;
import org.springframework.data.repository.CrudRepository;

public interface GoodsordersRepository extends CrudRepository<Goodsorders,Long> {
}
