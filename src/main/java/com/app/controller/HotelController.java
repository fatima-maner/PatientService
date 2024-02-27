package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Hotel;
import com.app.service.HotelServiceImpl;



@RestController
@RequestMapping("/hotels")
public class HotelController {
	@Autowired
	private HotelServiceImpl hotelService;

	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
		Hotel hotel1 = hotelService.saveHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
	}

	
	  @GetMapping("/{hotelId}") 
	  public ResponseEntity<Hotel> getSingleHotel(@PathVariable String hotelId){ 
		  Hotel hotel=hotelService.getHotel(hotelId); 
	  return ResponseEntity.ok(hotel);
	  
	 }
	 

	@GetMapping
	public ResponseEntity<List<Hotel>> getAllhotel() {
		List<Hotel> allHotel = hotelService.getAllHotel();
		return ResponseEntity.ok(allHotel);
	}
}
