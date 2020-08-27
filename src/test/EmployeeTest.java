package test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.junit.Test;


import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

public class EmployeeTest {
	
	// PRUEBAS PARA METODO cs()
	
	/**
	 *Para esta prueba el tipo de empleado es Worker. Además, el currency o 
	 *tipo de moneda es "USD", por ello el salario queda igual al entrar al
     *condicional. El resultado esperado para este caso depende del mes. Si el mes
     *es par, el valor esperado es el mismo salario. Si el mes es impar, el valor
     *esperado es la suma del salario + rmu/12*2.
     **/
	@Test
	public void csWorkerUSDTest() {
		Employee employee = new Employee(500,"USD",50,EmployeeType.Worker);
		Date date = new Date();
		LocalDate localDate;
        localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
		float valor;
        if(month%2==0)
			valor=500.000f;
		else
			valor=564.333f;
		assertEquals(valor, employee.cs(), 0.001f);
	}
	
	/**
	 *Para esta prueba el tipo de empleado es Supervisor. Además, el currency o tipo 
	 *de moneda es "USD", por ello el salario queda igual al entrar al condicional. 
	 *El resultado esperado para este caso es el salario más la suma de un porcentaje 
	 *bonus multiplicado por 0.35 más el decimo (rmu/12*2) en caso de que el mes sea
	 *impar. Si es par, el resultado esperado solo es el salario más la bonificación.
	 **/
	@Test
	public void csSupervisorUSDTest() {
		Employee employee = new Employee(500,"USD",50,EmployeeType.Supervisor);
		Date date = new Date();
		LocalDate localDate;
        localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
		float valor;
        if(month%2==0)
			valor=517.500f;
		else
			valor=581.833f;
		assertEquals(valor, employee.cs(), 0.001f);
	
	}
	
	/**
	 *Para esta prueba el tipo de empleado es Manager. Además, el currency o tipo 
	 *de moneda es "USD", por ello el salario queda igual al entrar al condicional.
	 *El resultado esperado para este caso es el salario más la suma de un porcentaje 
	 *bonus multiplicado por 0.7 más el decimo (rmu/12*2) en caso de que el mes sea
	 *impar. Si es par, el resultado esperado solo es el salario más la bonificación.
	 **/	
	@Test
	public void csManagerUSDTest() {
		Employee employee = new Employee(500,"USD",50,EmployeeType.Manager);
		Date date = new Date();
		LocalDate localDate;
        localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
		float valor;
        if(month%2==0)
			valor=535.000f;
		else
			valor=599.333f;
		assertEquals(valor, employee.cs(), 0.001f);
		
	}
	
	/**
	 *Para esta prueba el tipo de empleado es Worker. Además, el currency o 
	 *tipo de moneda es diferente a "USD", en este caso es "Euro", por ello el 
     *salario se ve reducido en un 5%. El resultado esperado para este caso depende 
     *del mes. Si el mes es par, el valor esperado es el salario resultante después 
     *de la disminución. Si el mes es impar, el valor esperado es la suma del salario 
     *resultante + rmu/12*2.
     **/
	@Test
	public void csWorkerEuroTest() {
		Employee employee = new Employee(500,"Euro",50,EmployeeType.Worker);
		Date date = new Date();
		LocalDate localDate;
        localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
		float valor;
        if(month%2==0)
			valor=475.000f;
		else
			valor=539.333f;
		assertEquals(valor, employee.cs(), 0.001f);
	}
	
	/**
	 *Para esta prueba el tipo de empleado es Supervisor. Además, el currency o 
	 *tipo de moneda es diferente a "USD", en este caso es "Euro", por ello el 
     *salario se ve reducido en un 5%. El resultado esperado para este caso es el 
     *salario resultante de la disminución más la suma de un porcentaje bonus 
     *multiplicado por 0.35 más el decimo (rmu/12*2) en caso de que el mes sea
	 *impar. Si es par, el resultado esperado solo es el salario resultante más 
	 *la bonificación.
	 **/
	@Test
	public void csSupervisorEuroTest() {
		Employee employee = new Employee(500,"Euro",50,EmployeeType.Supervisor);
		Date date = new Date();
		LocalDate localDate;
        localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
		float valor;
        if(month%2==0)
			valor=492.500f;
		else
			valor=556.833f;
		assertEquals(valor, employee.cs(), 0.001f);
	
	}
	
	/**
	 *Para esta prueba el tipo de empleado es Manager. Además, el currency o 
	 *tipo de moneda es diferente a "USD", en este caso es "Euro", por ello el 
     *salario se ve reducido en un 5%. El resultado esperado para este caso es el 
     *salario resultante de la disminución más la suma de un porcentaje bonus 
     *multiplicado por 0.7 más el decimo (rmu/12*2) en caso de que el mes sea
	 *impar. Si es par, el resultado esperado solo es el salario resultante más 
	 *la bonificación.
	 **/
	@Test
	public void csManagerEuroTest() {
		Employee employee = new Employee(500,"Euro",50,EmployeeType.Manager);
		Date date = new Date();
		LocalDate localDate;
        localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
		float valor;
        if(month%2==0)
			valor=510.000f;
		else
			valor=574.333f;
		assertEquals(valor, employee.cs(), 0.001f);
		
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
	 *se ve disminuido en un 5%. El resultado esperado viene a ser igual al rmu.
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