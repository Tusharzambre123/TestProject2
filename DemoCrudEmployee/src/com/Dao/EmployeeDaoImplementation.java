package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Configuration.DBConnect;
import com.Model.Employee;

public class EmployeeDaoImplementation implements EmployeeDao 
{
  private static final String EMPLOYEE_INSERT_SQL="insert into employee(empname,empqualification,empsalary)values"
			+ "(?,?,?)";
  private static final String FETCH_EMPLOYEEDETAILS_SQL="select * from employee";
  private static final String FETCH_EMPLOYEEDETAIL_SQL="select * from employee where empid=?";
  private static final String DELETE_EMPLOYEEDETAIL_SQL="delete from employee where empid=?";
  private static final String UPDATE_EMPLOYEEDETAILS_SQL="update employee set empqualification=?,empsalary=? where empid=?";

	@Override
	public boolean insertEmployee(Employee e) // insert query
	{
		try(Connection con=DBConnect.getConnection();
		PreparedStatement pst = con.prepareStatement(EMPLOYEE_INSERT_SQL))
		{
			pst.setString(1,e.getEmpname());
			pst.setString(2,e.getEmpqualification());
			pst.setInt(3,e.getEmpsalary());
			
			pst.executeUpdate();
			return true;
			
			
			
			
		} catch (SQLException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean deleteEmployeeById(int empid)
	{
		try(Connection con=DBConnect.getConnection();
		   PreparedStatement pst=con.prepareStatement(DELETE_EMPLOYEEDETAIL_SQL))
		{
			
			pst.setInt(1, empid);
			pst.executeUpdate();
			return true;
			
			
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee e) 
	{
		try(Connection con=DBConnect.getConnection();
		 PreparedStatement pst=con.prepareStatement(UPDATE_EMPLOYEEDETAILS_SQL))
		{
			pst.setString(1,e.getEmpqualification());
			pst.setInt(2,e.getEmpsalary());
			pst.setInt(3,e.getEmpid());
			pst.executeUpdate();
			return true;
			
			
		} catch (SQLException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Employee> getAllEmployees() 
	{
		try(Connection con = DBConnect.getConnection();
			Statement st = con.createStatement())
		{
			ResultSet rs = st.executeQuery(FETCH_EMPLOYEEDETAILS_SQL);
			ArrayList<Employee> al = new ArrayList<Employee>();
			while(rs.next())
			{
				Employee e1 = new Employee();
				e1.setEmpid(rs.getInt(1));
				e1.setEmpname(rs.getString(2));
				e1.setEmpqualification(rs.getString(3));
				e1.setEmpsalary(rs.getInt(4));
				al.add(e1);
				
			}
			
			return al;
			
			
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return null;
	}

	@Override
	public Employee getEmployeeById(int empid) 
	{
		try(Connection con = DBConnect.getConnection();
		PreparedStatement pst=con.prepareStatement(FETCH_EMPLOYEEDETAIL_SQL))
		{
		   pst.setInt(1, empid);
		   ResultSet rs=pst.executeQuery();
		   if(rs.next())
		   {
			   Employee e1 = new Employee();
			   e1.setEmpid(rs.getInt(1));
			   e1.setEmpname(rs.getString(2));
			   e1.setEmpqualification(rs.getString(3));
			   e1.setEmpsalary(rs.getInt(4));
			   return e1;
			   
		   }
		   else
			   return null;
		   
			
			
			
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
