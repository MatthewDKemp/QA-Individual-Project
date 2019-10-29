package com.nationwide.mkproject.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nationwide.mkproject.entity.Passengers;
import com.nationwide.mkproject.repository.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	private PassengerRepository repository;
	
	public List<Passengers> getAllPassengers(){
		return repository.findAll();
	}
	
	public Passengers addNewPassenger(Passengers passenger) {
		return repository.save(passenger);
	}

	public Passengers updatePassenger(Passengers passenger) {
		return repository.save(passenger);
	}

	public String deletePassenger(int passengerId) {
		repository.deleteById(passengerId);
		return "Succesfully deleted";
	}
}
