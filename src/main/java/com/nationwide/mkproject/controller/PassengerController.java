package com.nationwide.mkproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.nationwide.mkproject.entity.Passengers;
import com.nationwide.mkproject.service.PassengerService;

@RestController
@CrossOrigin("*")
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;
	
	@GetMapping("/passenger")
	public List<Passengers> getAllPassengers(){
		return passengerService.getAllPassengers();
	}
	
	@PostMapping("/passenger")
	public Passengers addNewPassenger(@RequestBody Passengers passenger) {
		return passengerService.addNewPassenger(passenger);
	}
	
	@PutMapping("/passenger")
	public Passengers updatePassenger(@RequestBody Passengers passenger) {
		return passengerService.updatePassenger(passenger);
	}
	
	@DeleteMapping("/passenger/{id}")
	public String deletePassenger(@PathVariable(value = "id") int id) {
		return passengerService.deletePassenger(id);
	}
	
}
