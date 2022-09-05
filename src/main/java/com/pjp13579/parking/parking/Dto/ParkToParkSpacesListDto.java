package com.pjp13579.parking.parking.Dto;

import java.util.List;

import com.pjp13579.parking.parking.Entities.ParkingSpace;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkToParkSpacesListDto {
	
	private List<ParkingSpace> parkingSpace;
}
