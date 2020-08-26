package test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

public class EmployeeTest {
	
	/*public Employee createEmployee(float salary, String currency, 
	        float bonusPercentage, EmployeeType employeeType){
		return new Employee(salary, currency, bonusPercentage,employeeType) ;
	}
	Se deberia crear esto por la eficiencia y verificar si es nulo esas dos cosas
	creo que dijo el profe
	*/
	
	@Test
	public void CalculateYearBonusWorkerEurotest() {
		Employee employee = new Employee(450,"euro",10,EmployeeType.Worker);
		assertEquals(386.0, employee.CalculateYearBonus(),5.0);
	}
	
	@Test
	public void CalculateYearBonusSupervisorEurotest() {
		Employee employee = new Employee(550,"euro",10,EmployeeType.Supervisor);
		assertEquals(715.5, employee.CalculateYearBonus(),5.0);
	}
	
	@Test
	public void CalculateYearBonusManagerEurotest() {
		Employee employee = new Employee(750,"euro",10,EmployeeType.Manager);
		assertEquals(1098.5, employee.CalculateYearBonus(),5.0);
	}
	
	/*Para esta prueba el tipo de empleado es Worker.Además, el currency o 
	 tipo de moneda es "USD", por ello el salario queda igual al entrar al
     condicional.El resultado esperado para este caso es el mismo salario esto 
     debido a que el mes es par, por lo que no se le añade el decimo a su salario */
	@Test
	public void csWorkerUSDTest() {
		Employee employee = new Employee(450,"USD",10,EmployeeType.Worker);
		assertEquals(450,employee.cs(),5);
	}
	
	/*Para esta prueba el tipo de empleado es Supervisor. Además, el currency o tipo 
	 de moneda es "USD", por ello el salario queda igual al entrar al condicional. 
	 El resultado esperado para este caso el salario se le suma un porcentaje bonus 
	 multiplicado por 0.35  y  debido a que el mes es par no se le añade nada más a
	 su salario */
	@Test
	public void csSupervisorUSDTest() {
		Employee employee = new Employee(550,"USD",10,EmployeeType.Supervisor);
		assertEquals(550,employee.cs(),5);
	
	}
	
	/*Para esta prueba el tipo de empleado es Manager. Además, el currency o tipo 
	 de moneda es "USD", por ello el salario queda igual al entrar al condicional.
	 El resultado esperado para este caso el salario se le suma un porcentaje bonus 
	 multiplicado por 0.7 y debido a que el mes es par no se le añade nada más a
	 su salario */		
	@Test
	public void csManagerUSDTest() {
		Employee employee = new Employee(750,"USD",10,EmployeeType.Manager);
		assertEquals(750,employee.cs(),5);
		
	}
	
	
	/*Para esta prueba el tipo de empleado es Supervisor.Además, el currency o 
	 tipo de moneda es "USD", por ello el salario no se multiplica por ningún valor. 
	 El resultado esperado viene a ser igual al rmu*/
	
	@Test
	public void CalculateYearBonusWorkerUSDtest() {
		Employee employee = new Employee(350,"USD",20,EmployeeType.Worker);
		assertEquals(386.0, employee.CalculateYearBonus(),5.0);
	}
	
	/*Para esta prueba el tipo de empleado es Supervisor.Además, el currency o 
	 tipo de moneda es "USD", por ello el salario no se multiplica por ningún valor. 
	 El resultado esperado para esta prueba, viene de: salario + rmu * 0.5*/
	
	@Test
	public void CalculateYearBonusSupervisorUSDtest() {
		Employee employee = new Employee(450,"USD",20,EmployeeType.Supervisor);
		assertEquals(643.5,employee.CalculateYearBonus(),5.0);
	}
	
	/*Para esta prueba el tipo de empleado es Manager.Además, el currency o 
	 tipo de moneda es "USD", por ello el salario no se multiplica por ningún valor. 
	 El resultado esperado para esta prueba, viene de:salario + rmu * 1.0*/
	
	@Test
	public void CalculateYearBonusManagerUSDtest() {
		Employee employee = new Employee(600,"USD",20,EmployeeType.Manager);
		assertEquals(986.0,employee.CalculateYearBonus(),5.0);
	}

	
	

}

