package com.np.spring.dao;

import java.util.List;

import com.np.spring.dto.EmployeeDTO;

public interface EmployeeDAO {
	public int insert(EmployeeDTO dto);
	
	public int update(EmployeeDTO dto);
	
	public int delete(EmployeeDTO dto);
	
	public EmployeeDTO read(int id);
	
	public List<EmployeeDTO> readAll();
}//interface
