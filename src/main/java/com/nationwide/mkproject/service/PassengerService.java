package com.nationwide.mkproject.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nationwide.mkproject.entity.Passenger;
import com.nationwide.mkproject.repository.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	private PassengerRepository repository;
	
	public List<Passenger> getAllPassengers(){
		return repository.findAll();
	}
	
	public Passenger addNewPassenger(Passenger passenger) {
		return repository.save(passenger);
	}

	public Passenger updatePassenger(Passenger passenger) {
		return repository.save(passenger);
	}

	public String deletePassenger(int passengerId) {
		repository.deletePassenger(passengerId);
		return "Succesfully deleted";
	}
}
