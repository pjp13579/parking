package com.pjp13579.parking.Mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import com.pjp13579.parking.parking.Dto.ParkingSpaceDto;
import com.pjp13579.parking.parking.Entities.ParkingSpace;

public class ParkingSpaceMapper {
	
	//using @Autowired here will cause ModelMapper to throw a NullPointerException
	//@Autowired private static ModelMapper modelMapper;
	private static ModelMapper modelMapper = new ModelMapper();

	public static ParkingSpaceDto parkingSpaceDto1(ParkingSpace parkingSpace){
		modelMapper.getConfiguration()
			.setMatchingStrategy(MatchingStrategies.LOOSE);
			ParkingSpaceDto parkingSpaceDto = modelMapper.map(parkingSpace, ParkingSpaceDto.class);
			return parkingSpaceDto;
	}
}
