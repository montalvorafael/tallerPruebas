package test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

public class EmployeeTest {
	
	@Test
	public void CalculateYearBonusWorkerEurotest() {
		Employee employee = new Employee(450,"euro",10,EmployeeType.Worker);
		
		double salario= employee.CalculateYearBonus();
		assertEquals(386.0, salario,5.0);
	}
	
	@Test
	public void CalculateYearBonusSupervisorEurotest() {
		Employee employee = new Employee(550,"euro",10,EmployeeType.Supervisor);
		
		double salario= employee.CalculateYearBonus();
		assertEquals(715.5, salario,5.0);
	}
	
	@Test
	public void CalculateYearBonusManagerEurotest() {
		Employee employee = new Employee(750,"euro",10,EmployeeType.Manager);
		
		double salario= employee.CalculateYearBonus();
		assertEquals(1098.5, salario,5.0);
	}
	
	/*
	 * 
	 */
	@Test
	public void csWorkerUSDTest() {
		Employee employee = new Employee(450,"USD",10,EmployeeType.Worker);
		float salario = employee.cs();
		assertEquals(450,salario,5);
		
	}
	@Test
	public void csSupervisorUSDTest() {
		Employee employee = new Employee(550,"euro",10,EmployeeType.Supervisor);
		float salario = employee.cs();
		assertEquals(526,salario,5);
		
	}
	@Test
	public void csManagerUSDTest() {
		Employee employee = new Employee(750,"euro",10,EmployeeType.Manager);
		float salario = employee.cs();
		assertEquals(719.5,salario,5);
		
	}
	


	

}

