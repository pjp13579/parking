package com.pjp13579.parking.Mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pjp13579.parking.parking.Dto.ParkDto;
import com.pjp13579.parking.parking.Dto.ParkToParkSpacesListDto;
import com.pjp13579.parking.parking.Entities.Park;

@Component
public class ParkMapper {

	//using @Autowired here will cause ModelMapper to throw a NullPointerException
	//@Autowired private static ModelMapper modelMapper;
	private static ModelMapper modelMapper = new ModelMapper();

	public static ParkDto parkDto1(Park park){
		modelMapper.getConfiguration()
			.setMatchingStrategy(MatchingStrategies.LOOSE);
			ParkDto parkDto = modelMapper.map(park, ParkDto.class);
			return parkDto;
	}

	public static ParkToParkSpacesListDto parkToParkSpacesListDto(Park park){
		modelMapper.getConfiguration()
			.setMatchingStrategy(MatchingStrategies.LOOSE);

			ParkToParkSpacesListDto parkToParkSpacesListDto = modelMapper.map(park, ParkToParkSpacesListDto.class);

			return parkToParkSpacesListDto;
	}
}
