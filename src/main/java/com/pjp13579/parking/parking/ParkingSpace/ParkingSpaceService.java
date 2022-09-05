package com.pjp13579.parking.parking.ParkingSpace;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.pjp13579.parking.Mappers.ParkingSpaceMapper;
import com.pjp13579.parking.parking.Dto.ParkingSpaceDto;
import com.pjp13579.parking.parking.Entities.ParkingSpace;

public class ParkingSpaceService {
	
	@Autowired
	private ParkingSpaceRepository repo;

	public List<ParkingSpaceDto> findAll(){
		return repo.findAll()
			.stream()
			.map(ParkingSpaceMapper::parkingSpaceDto1)
			.collect(Collectors.toList());
	}

	public ParkingSpace save(ParkingSpace parkingSpace){
		return repo.save(parkingSpace);
	}
}
