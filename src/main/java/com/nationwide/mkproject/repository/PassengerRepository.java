package com.nationwide.mkproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nationwide.mkproject.entity.Passengers;

@Repository
public interface PassengerRepository extends JpaRepository<Passengers, Integer>{
	
}
