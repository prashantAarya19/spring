package com.np.spring.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.np.spring.dao.PassengerDAO;
import com.np.spring.dao.rowmapper.PassengerRowMapper;
import com.np.spring.dto.EmployeeDTO;
import com.np.spring.dto.PassengerDTO;

@Repository("passengerDao")
public class PassengerDAOImpl implements PassengerDAO {
	// fields
	private JdbcTemplate template = null;
	private static final String INSERT_QUERY = "insert into passenger values(?, ?, ?)";
	private static final String READ_QUERY = "select * from passenger where id = ?";
	private static final String READ_ALL = "select * from passenger";

	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int insert(PassengerDTO dto) {
		int result = template.update(INSERT_QUERY, dto.getId(), dto.getFirstName(), dto.getLastName());
		return result;
	}
	@Override
	public EmployeeDTO read(int id) {
		PassengerRowMapper mapper = new PassengerRowMapper();
		EmployeeDTO result = template.queryForObject(READ_QUERY, mapper, id);
		return result;
	}

	@Override
	public List<EmployeeDTO> readAll() {
		PassengerRowMapper mapper = new PassengerRowMapper();
		List<EmployeeDTO> result = template.query(READ_ALL, mapper);
		return result;
	}


}
