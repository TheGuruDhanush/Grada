package com.grada.ecommerce.Data;

import com.grada.ecommerce.Models.User.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ReviewRepository extends CrudRepository<Review, Long>
{

}
