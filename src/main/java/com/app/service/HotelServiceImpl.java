package com.app.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IHotelDao;
import com.app.exception.ResourceNotFoundException;
import com.app.pojo.Hotel;



@Service
public class HotelServiceImpl implements IHotelService{
	@Autowired
	private IHotelDao hotelDao;
	@Override
	public Hotel saveHotel(Hotel hotel) {
		String randomClientId= UUID.randomUUID().toString();
		hotel.setHotelId(randomClientId);
		 return hotelDao.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		return hotelDao.findAll();
	}

	

	@Override
	public Hotel getHotel(String hotelId) {
		// TODO Auto-generated method stub
		return hotelDao.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Client with given id is not found on server!!: " +hotelId));
	}

	/*
	 * @Override public User getUser(String userId) { // TODO Auto-generated method
	 * stub return null; }
	 */
/*	@Override
	public User getUser(String userId) {
		
		return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id is not found on server!!: " +userId));
	}*/

}
