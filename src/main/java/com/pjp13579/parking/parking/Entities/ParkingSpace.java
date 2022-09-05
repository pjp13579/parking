package com.pjp13579.parking.parking.Entities;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
public class ParkingSpace {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String info;
	private Date creatingDate;
	private Double cost;
	
	@ManyToOne()
	@JoinColumn(name = "parkId")
	private Park park;

	@Getter @Setter(AccessLevel.NONE)
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Ticket.class, cascade = CascadeType.MERGE)
	private List<Ticket> tickets;



}
