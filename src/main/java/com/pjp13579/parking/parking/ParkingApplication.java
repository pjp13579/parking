package com.pjp13579.parking.parking;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pjp13579.parking.parking.ParkingSpace.ParkingSpaceService;

@SpringBootApplication
public class ParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingApplication.class, args);
	}

	//required, because when compiling, this bean couldn't be found automatically
	/* 
	! maybe, using this is causing the NullException on the Mapper class*/
	@Bean
	public ModelMapper modelMapper() {
 		return new ModelMapper();
	}

	@Bean
	public ParkingSpaceService parkingSpaceService(){
		return new ParkingSpaceService();
	}

}
