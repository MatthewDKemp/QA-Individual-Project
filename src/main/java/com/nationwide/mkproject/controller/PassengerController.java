package com.nationwide.mkproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.nationwide.mkproject.entity.Passenger;
import com.nationwide.mkproject.service.PassengerService;

@RestController
@RequestMapping("/passengers")
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;
	
	@GetMapping("/passengers")
	public List<Passenger> getAllPassengers(){
		return passengerService.getAllPassengers();
	}
	
	@PostMapping("/passengers")
	public Passenger addNewPassenger(@RequestBody Passenger passenger) {
		return passengerService.addNewPassenger(passenger);
	}
	
	@PutMapping("/passengers")
	public Passenger updatePassenger(@RequestBody Passenger passenger) {
		return passengerService.updatePassenger(passenger);
	}
	
	@DeleteMapping("/passengers/{id}")
	public String deletePassenger(@PathVariable(value = "id") int id) {
		return passengerService.deletePassenger(id);
	}
	
}
