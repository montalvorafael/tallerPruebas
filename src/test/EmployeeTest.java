package test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
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


	

}

