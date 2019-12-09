package com.np.spring.dao;

import java.util.List;

import com.np.spring.dto.EmployeeDTO;
import com.np.spring.dto.PassengerDTO;

public interface PassengerDAO {
	
	public int insert(PassengerDTO dto);
	public EmployeeDTO read(int id);
	public List<EmployeeDTO> readAll();

}
