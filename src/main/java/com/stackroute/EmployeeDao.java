package com.stackroute;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.*;
import java.util.List;

@ComponentScan
public class EmployeeDao {
    JdbcTemplate jdbcTemplate;

     public void setTemplate(JdbcTemplate jdbctemplate) {
        this.jdbcTemplate=jdbcTemplate;
    }

    public Employee getEmployeebyId(int empId) {

        String sql= ("select *from EmployeesSpring where id=?");
        return jdbcTemplate.queryForObject(sql,new Object[]{empId},new BeanPropertyRowMapper<Employee>(Employee.class));

    }

    public int save(Employee employee){
        String sql="insert into EmployeesSpring values("+employee.getEmpId()+",'"+employee.getEmpName()+"',"+employee.getEmpSalary()+",'"+employee.getEmpGender()+"')";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }
    public int update(Employee employee){
        String sql="update EmployeesSpring set name='"+employee.getEmpName()+"', salary="+employee.getEmpSalary()+",gender='"+employee.getEmpGender()+"' where id="+employee.getEmpId()+"";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }
    public int delete(int id){
        String sql="delete from EmployeesSpring where id="+id+"";
        return jdbcTemplate.update(sql);
    }

    public List<Employee> getEmployees(){
        return jdbcTemplate.query("select * from EmployeesSpring",new RowMapper<Employee>(){
            public Employee mapRow(ResultSet rs, int row) throws SQLException {
                Employee e=new Employee();
                e.setEmpId(rs.getInt(1));
                e.setEmpName(rs.getString(2));
                e.setEmpSalary(rs.getLong(3));
                e.setEmpGender(rs.getString(4));
                return e;
            }
        });
    }



    }
