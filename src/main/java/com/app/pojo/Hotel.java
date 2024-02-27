package com.app.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "hotel")
public class Hotel {
	@Id
	private String hotelId;
	@Column(name = "NAME", length = 20)
	private String name;
	@Column(name = "LOCATION", length = 20)
	private String location;
	@Column(name = "ABOUT", length = 20)
	private String about;
}
