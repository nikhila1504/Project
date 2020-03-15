package com.cts.repositroy;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.cts.beans.Seller;



public interface SellerRepository extends CrudRepository<Seller, Integer>{

	Optional<Seller> findById(int id);

}