package com.grada.ecommerce.Data;

import com.grada.ecommerce.Models.Product.Product;
import com.grada.ecommerce.Models.Product.ShortProduct;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Collection;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long>
{
    //Collection<Product> findByTitleLike(@Param("title") String title);
    Collection<ShortProduct> findByTitleLike(String title);
    //Collection<ShortProduct> findAllByTitleLike(@Param("title") String title);

    //Product findProductById(@Param("id") Long id);
}