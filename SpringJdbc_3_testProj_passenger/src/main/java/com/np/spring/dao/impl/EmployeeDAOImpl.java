package com.np.spring.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.np.spring.dao.EmployeeDAO;
import com.np.spring.dao.rowmapper.EmployeeRowMapper;
import com.np.spring.dto.EmployeeDTO;

@Component("dao")
public class EmployeeDAOImpl implements EmployeeDAO {
	// fields
	private JdbcTemplate template = null;
	private static final String INSERT_QUERY = "insert into employee values(?, ?, ?)";
	private static final String UPDATE_QUERY = "update employee set fistname = ?, lastname =? where id = ?";
	private static final String DELETE_QUERY = "delete from employee where id = ?";
	private static final String SELECT_QUERY = "select * from employee where id = ?";
	private static final String SELECT_ALL = "select * from employee";
	@Override
	public int insert(EmployeeDTO dto) {
		int result = template.update(INSERT_QUERY, dto.getId(), dto.getFirstname(), dto.getLastname());
		return result;
	}

	@Override
	public int update(EmployeeDTO dto) {
		int result = template.update(UPDATE_QUERY, dto.getFirstname(), dto.getLastname(), dto.getId());
		return result;
	}

	@Override
	public int delete(EmployeeDTO dto) {
		int result = template.update(DELETE_QUERY, dto.getId());
		return result;
	}
	@Override
	public EmployeeDTO read(int id) {
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		EmployeeDTO dto = template.queryForObject(SELECT_QUERY, rowmapper, id);
		return dto;
	}

	@Override
	public List<EmployeeDTO> readAll() {
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		List<EmployeeDTO> result = template.query(SELECT_ALL, rowmapper);
		return result;
	}
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}



}
