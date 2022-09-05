package com.pjp13579.parking.parking.ParkingSpace;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjp13579.parking.parking.Dto.ParkingSpaceDto;
import com.pjp13579.parking.parking.Entities.ParkingSpace;

@RestController
@RequestMapping("/api/v1/parkingspace")
public class ParkingSpaceController {
	

	@Autowired
	private ParkingSpaceService service;

	@GetMapping("/findAll")
	public List<ParkingSpaceDto> findAll(){
		return service.findAll();
	}

	@PostMapping("/save")
	public ParkingSpace save(@RequestBody ParkingSpace parkingSpace){
		return service.save(parkingSpace);
	}
}
