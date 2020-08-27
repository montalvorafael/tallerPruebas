package test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

public class EmployeeTest {
	
	// PRUEBAS PARA METODO cs()
	
	/**
	 *Para esta prueba el tipo de empleado es Worker. Además, el currency o 
	 *tipo de moneda es "USD", por ello el salario queda igual al entrar al
     *condicional. El resultado esperado para este caso es el mismo salario, esto 
     *debido a que el mes es par, por lo que no se le añade el decimo a su salario 
     **/
	@Test
	public void csWorkerUSDTest() {
		Employee employee = new Employee(500,"USD",50,EmployeeType.Worker);
		assertEquals(500f, employee.cs(), 0.0f);
	}
	
	/**
	 *Para esta prueba el tipo de empleado es Supervisor. Además, el currency o tipo 
	 *de moneda es "USD", por ello el salario queda igual al entrar al condicional. 
	 *El resultado esperado para este caso es el salario mas la suma de un porcentaje 
	 *bonus multiplicado por 0.35 y debido a que el mes es par no se le añade nada más a
	 *su salario 
	 **/
	@Test
	public void csSupervisorUSDTest() {
		Employee employee = new Employee(500,"USD",50,EmployeeType.Supervisor);
		assertEquals(517.5f, employee.cs(), 0.0f);
	
	}
	
	/**
	 *Para esta prueba el tipo de empleado es Manager. Además, el currency o tipo 
	 *de moneda es "USD", por ello el salario queda igual al entrar al condicional.
	 *El resultado esperado para este caso es el salario mas la suma de un porcentaje 
	 *bonus multiplicado por 0.7 y debido a que el mes es par no se le añade nada más a
	 *su salario 
	 */		
	@Test
	public void csManagerUSDTest() {
		Employee employee = new Employee(500,"USD",50,EmployeeType.Manager);
		assertEquals(535f, employee.cs(), 0.0f);
		
	}
	
	/**
	 *Para esta prueba el tipo de empleado es Worker. Además, el currency o 
	 *tipo de moneda es diferente a "USD", en este caso es "Euro", por ello el 
     *salario se ve reducido en un 5%. El resultado esperado para este caso solo es 
     *el salario resultante de la disminución. No se añade el décimo debido a que 
     *este mes no es impar.
     **/
	@Test
	public void csWorkerEuroTest() {
		Employee employee = new Employee(500,"Euro",50,EmployeeType.Worker);
		assertEquals(475, employee.cs(), 0.0f);
	}
	
	/**
	 *Para esta prueba el tipo de empleado es Supervisor. Además, el currency o 
	 *tipo de moneda es diferente a "USD", en este caso es "Euro", por ello el 
     *salario se ve reducido en un 5%. El resultado esperado para este caso es el
     *salario resultante de la disminución mas la suma de un porcentaje bonus 
	 *multiplicado por 0.35, aunque no se añade el décimo debido a que este mes no
	 *es impar.
     **/
	@Test
	public void csSupervisorEuroTest() {
		Employee employee = new Employee(500,"Euro",50,EmployeeType.Supervisor);
		assertEquals(492.5f, employee.cs(), 0.0f);
	
	}
	
	/**
	 *Para esta prueba el tipo de empleado es Manager. Además, el currency o 
	 *tipo de moneda es diferente a "USD", en este caso es "Euro", por ello el 
     *salario se ve reducido en un 5%. El resultado esperado para este caso es el
     *salario resultante de la disminución mas la suma de un porcentaje bonus 
	 *multiplicado por 0.7, aunque no se añade el décimo debido a que este mes no
	 *es impar.
     **/		
	@Test
	public void csManagerEuroTest() {
		Employee employee = new Employee(500,"Euro",50,EmployeeType.Manager);
		assertEquals(510, employee.cs(), 0.0f);
		
	}
	
	// PRUEBAS PARA METODO CalculateYearBonus()
	
	/**
	 *Para esta prueba el tipo de empleado es Worker. Además, el currency o 
	 *tipo de moneda es "USD", por ello el salario no se ve afectado. 
	 *El resultado esperado viene a ser igual al rmu.
	 */	
	@Test
	public void calculateYearBonusWorkerUSDTest() {
		Employee employee = new Employee(500,"USD",50,EmployeeType.Worker);
		assertEquals(386.0f, employee.CalculateYearBonus(), 0.0f);
	}
	
	/**
	 *Para esta prueba el tipo de empleado es Supervisor. Además, el currency o 
	 *tipo de moneda es "USD", por ello el salario no se ve afectado.
	 *El resultado esperado para esta prueba, viene de: salario + rmu * 0.5
	 */	
	@Test
	public void calculateYearBonusSupervisorUSDTest() {
		Employee employee = new Employee(500,"USD",50,EmployeeType.Supervisor);
		assertEquals(693.0f, employee.CalculateYearBonus(), 0.0f);
	}
	
	/**
	 *Para esta prueba el tipo de empleado es Manager. Además, el currency o 
	 *tipo de moneda es "USD", por ello el salario no se ve afectado. 
	 *El resultado esperado para esta prueba, viene de: salario + rmu * 1.0
	 */
	@Test
	public void calculateYearBonusManagerUSDTest() {
		Employee employee = new Employee(500,"USD",50,EmployeeType.Manager);
		assertEquals(886.0f, employee.CalculateYearBonus(), 0.0f);
	}

	/**
	 *Para esta prueba el tipo de empleado es Worker. Además, el currency o 
	 *tipo de moneda es diferente a "USD", en este caso es "Euro", por ello el salario 
	 *se ve disminuido en un 5%. 
	 *El resultado esperado viene a ser igual al rmu.
	 */
	@Test
	public void calculateYearBonusWorkerEuroTest() {
		Employee employee = new Employee(500,"Euro",50,EmployeeType.Worker);
		assertEquals(386.0f, employee.CalculateYearBonus(), 0.0f);
	}
	
	/**
	 *Para esta prueba el tipo de empleado es Supervisor. Además, el currency o 
	 *tipo de moneda es diferente a "USD", en este caso es "Euro", por ello el salario 
	 *se ve disminuido en un 5%. 
	 *El resultado esperado de esta prueba, viene de: salario resultante + rmu*0.5
	 */
	@Test
	public void calculateYearBonusSupervisorEuroTest() {
		Employee employee = new Employee(500,"Euro",50,EmployeeType.Supervisor);
		assertEquals(668.0f, employee.CalculateYearBonus(), 0.0f);
	}
	
	/**
	 *Para esta prueba el tipo de empleado es Manager. Además, el currency o 
	 *tipo de moneda es diferente a "USD", en este caso es "Euro", por ello el salario 
	 *se ve disminuido en un 5%. 
	 *El resultado esperado de esta prueba, viene de: salario resultante + rmu*1.0
	 */
	@Test
	public void calculateYearBonusManagerEuroTest() {
		Employee employee = new Employee(500,"Euro",50,EmployeeType.Manager);
		assertEquals(861.0f, employee.CalculateYearBonus(), 0.0f);
	}
	

}

