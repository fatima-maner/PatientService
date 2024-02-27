package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Hotel;

public interface IHotelDao extends JpaRepository<Hotel, String>{

}
