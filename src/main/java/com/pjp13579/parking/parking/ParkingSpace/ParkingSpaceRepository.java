package com.pjp13579.parking.parking.ParkingSpace;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjp13579.parking.parking.Entities.ParkingSpace;

public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, String>{
	
}
