package com.pjp13579.parking.parking.Park;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjp13579.parking.parking.Dto.ParkDto;
import com.pjp13579.parking.parking.Entities.Park;


public interface ParkRepository extends JpaRepository<Park, Long>{
	List<ParkDto> findByParkId(Long parkId);
}
