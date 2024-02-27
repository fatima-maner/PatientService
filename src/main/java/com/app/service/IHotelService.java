package com.app.service;

import java.util.List;

import com.app.pojo.Hotel;



public interface IHotelService {

    //user operations

    //create
    Hotel saveHotel(Hotel user);

    //get all user
    List<Hotel> getAllHotel();

    //get single user of given userId

    Hotel getHotel(String hotelId);

    //TODO: delete
    //TODO: update


}