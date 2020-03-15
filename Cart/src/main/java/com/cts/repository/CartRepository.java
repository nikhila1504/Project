package com.cts.repository;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.cts.beans.Cart;
public interface CartRepository extends CrudRepository<Cart, Integer>{
	Optional<Cart> findById(int id);
}