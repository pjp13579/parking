package com.pjp13579.parking.parking.Park;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjp13579.parking.parking.Dto.ParkDto;
import com.pjp13579.parking.parking.Dto.ParkToParkSpacesListDto;
import com.pjp13579.parking.parking.Entities.Park;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/park")
public class ParkController {
	
	@Autowired
	private ParkService service;

	@GetMapping("/findAll")
	public Iterable<Park> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/findAllDto")
	public List<ParkDto> findAllDto(){
		return service.findAllDto();
	}

	@GetMapping("/findParkingSpaces/{parkId}")
	public Optional<Park> findParkingSpaces(@PathVariable Long parkId){
		return service.findParkingSpaces(parkId);
	}

	@GetMapping("/findParkingSpacesDto/{parkId}")
	public List<ParkDto> findParkingSpacesDto(@PathVariable Long parkId){
		return service.findParkingSpacesDto(parkId);
	}

	@GetMapping("/findParkingSpacesForParkId/{parkId}")
	public List<ParkToParkSpacesListDto> ParkToParkSpacesListDto(@PathVariable Long parkId){
		return service.findParkingSpacesForParkId(parkId);
	}

	@PostMapping("/save")
	public Park save(){
		Park park = new Park((long) 12, "car park", "Cityland","Old  grumpy woman", new Point(12, 1000), null);
		return service.save(park);
	}


}
