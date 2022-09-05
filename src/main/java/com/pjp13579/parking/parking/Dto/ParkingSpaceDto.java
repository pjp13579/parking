package com.pjp13579.parking.parking.Dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.pjp13579.parking.parking.Entities.Park;
import com.pjp13579.parking.parking.Entities.Ticket;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpaceDto {
	
	@Id
	private Long id;
	private Double cost;
	
	@OneToOne
	private Park park;

	@Getter @Setter(AccessLevel.NONE)
	@OneToMany
	private List<Ticket> tickets;
}
