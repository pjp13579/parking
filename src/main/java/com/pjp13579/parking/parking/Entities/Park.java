package com.pjp13579.parking.parking.Entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.geo.Point;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Park {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long parkId;
	private String name;
	private String city;
	private String owner;
	private Point location;
	
	
	@Getter @Setter(AccessLevel.NONE)
	@OneToMany(mappedBy = "park", cascade = CascadeType.ALL)
	private List<ParkingSpace> parkingSpaces;


	public void addParkingSpace(ParkingSpace parkingSpace){
		this.parkingSpaces.add(parkingSpace);
	}

	public void removeParkingSpace(ParkingSpace parkingSpace){
		this.parkingSpaces.remove(parkingSpace);
	}

	public Integer getCountOfParkingSpaces(){
		if(parkingSpaces == null)
			return 0;
		return this.parkingSpaces.size();
	}
}
