package com.pjp13579.parking.parking.Park;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjp13579.parking.Mappers.ParkMapper;
import com.pjp13579.parking.parking.Dto.ParkDto;
import com.pjp13579.parking.parking.Dto.ParkToParkSpacesListDto;
import com.pjp13579.parking.parking.Entities.Park;

@Service
public class ParkService {
	
	@Autowired private ParkRepository repo;

	public Iterable<Park> findAll(){
		return repo.findAll();
	}

	public  List<ParkDto> findAllDto(){
		return repo.findAll()
			.stream()
			.map(ParkMapper::parkDto1)
			.collect(Collectors.toList());
	}
	
	public Optional<Park> findParkingSpaces(Long parkId){
		return repo.findById(parkId);
	}

	public List<ParkDto> findParkingSpacesDto(Long parkId){
		return repo.findById(parkId)
			.stream()
			.map(ParkMapper::parkDto1)
			.collect(Collectors.toList());
	}

	public List<ParkToParkSpacesListDto> findParkingSpacesForParkId(Long parkId){
		return repo.findById(parkId)
			.stream()
			.map(ParkMapper::parkToParkSpacesListDto)
			.collect(Collectors.toList());
	}
	
	
	public Park save(Park park){
		return repo.save(park);
	}
}

