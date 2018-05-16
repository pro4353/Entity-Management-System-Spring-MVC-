package com.dao;

import java.sql.*;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.beans.Employee;
@Component
public class EmpDaoImpl implements EmpDao {
	private JdbcTemplate template;

	
	/* (non-Javadoc)
	 * @see com.dao.EmpDao#setTemplate(org.springframework.jdbc.core.JdbcTemplate)
	 */
	@Override
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	/*public List<Employee> getEmployees() {
		return template.query("select* from customer", new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int row) throws SQLException {
				Employee e = new Employee();
				e.setAcc_no(rs.getInt(1));
				e.setF_name(rs.getString(2));
				e.setL_name(rs.getString(3));
				e.setE_mail(rs.getString(4));
				e.setAmount(rs.getDouble(5));
				return e;
			}
		});
	}*/
	/* (non-Javadoc)
	 * @see com.dao.EmpDao#getEmployees()
	 */
	@Override
	public List<Employee> getEmployees() {
		String sql="select * from customer";
		return template.query(sql, new EmployeeMapper());
	}
	private static final class EmployeeMapper implements RowMapper<Employee>
	{

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			
			Employee e= new Employee();
			
			e.setAcc_no(rs.getInt(1));
			e.setF_name(rs.getString(2));
			e.setL_name(rs.getString(3));
			
			e.setE_mail(rs.getString(4));
			e.setAmount(rs.getInt(5));
			return e;
		}
		
	}
	
	/* (non-Javadoc)
	 * @see com.dao.EmpDao#insertEmployee(com.beans.Employee)
	 */
	@Override
	public void insertEmployee (Employee e) {
		String sql="insert into customer values(?,?,?,?,?)";
		template.update(sql,new Object[]{e.getAcc_no(),e.getF_name(),e.getL_name(),e.getE_mail(),e.getAmount()});
	}
	/* (non-Javadoc)
	 * @see com.dao.EmpDao#selectEmployee(int)
	 */
	@Override
	public Employee selectEmployee (int acc_no) {
		
		String sql="Select * from customer where acc_no=?";
		
		System.out.println(acc_no);
		Employee e=null;
		try
		{
		e= template.queryForObject(sql,new Object[]{acc_no},new EmployeeMapper());
		}
		catch(Exception ex)
		{
			System.out.println("Invalid account Number");
		}
		return e;
		
	}
	public int updateEmployee(int amount,int acc_no){  
	    String sql="update customer set amnt=?+amnt where acc_no=?";
	    
	   return template.update(sql,new Object[]{amount,acc_no}); 
	
	}
	
}
