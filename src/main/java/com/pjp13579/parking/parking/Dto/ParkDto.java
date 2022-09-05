package com.pjp13579.parking.parking.Dto;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.springframework.data.geo.Point;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkDto {
	
	@Id
	private Long parkId;
	private String name;
	private String city;	
	private Point location;
}
