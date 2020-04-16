package com.ntt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ntt.exceptions.EmployeeExceptions;
import com.ntt.myClass.Employee;

public class EmployeeDAO implements IEmployeeDAO {

	@Override
	public int addEmployee(int employeeId, String empName, String empType, String empExperience)
			throws EmployeeExceptions {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		int rows = 0;
		try {

			// Adding new employee

			ps.setInt(1, employeeId);
			ps.setString(2, empName);
			ps.setString(3, empType);
			ps.setString(4, empExperience);
			ps.executeUpdate();
			System.out.println("rows" + rows);

			// need to set connection to add the new employee details to
			// database

			ps.setString(1, empName);
			ps.setString(2, empType);
			rows = ps.executeUpdate();
			System.out.println("rows" + rows);

		} catch (SQLException e) {
			throw new EmployeeExceptions(e.getMessage() + "problem occured in addEmployee DAO");
		}
		return rows;
	}

	public static class Test {
		public static void main(String[] args) {
			TemporaryEmployee te = new TemporaryEmployee(1001, "Mubeena", "Temporary", 5000);
			PermanentEmployee pe = new PermanentEmployee(20001, "Pyariunnisa", "Permanent", "3", 25000);
			System.out.println(te.toString());
			System.out.println(pe.toString());
		}

	}
}
