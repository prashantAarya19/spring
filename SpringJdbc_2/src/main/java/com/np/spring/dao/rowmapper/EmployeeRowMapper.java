package com.np.spring.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.np.spring.dto.EmployeeDTO;

public class EmployeeRowMapper implements RowMapper<EmployeeDTO> {

	@Override
	public EmployeeDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("mapRow called. rowNum"+rowNum);
		EmployeeDTO dto = new EmployeeDTO();
		dto.setId(rs.getInt(1));
		dto.setFirstname(rs.getString(2));
		dto.setLastname(rs.getString(3));
		return dto;
	}

}
