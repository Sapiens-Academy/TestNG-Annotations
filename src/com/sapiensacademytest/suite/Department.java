package com.sapiensacademytest.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Department {
	@Test(dependsOnMethods= {"removeDepartment"})
	public void addDepartment() {
		System.out.println("4- Este metodo tiene el código de añadir un articulo al departamento");
	}
	
	@Test(dependsOnMethods= {"modifyDepartment"})
	public void removeDepartment() {
		System.out.println("3- Este metodo tiene el código de remover un articulo del departamento");
	}
	
	@Test(groups= {"add"})
	public void clickOnDepartment() {
		System.out.println("1- Este metodo tiene el código para hacer clic sobre un articulo del departamento");
	}

	@Test(dependsOnMethods= {"clickOnDepartment"})
	public void modifyDepartment() {
		System.out.println("2- Este metodo tiene el código para modificar un articulo del departamento");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Esto se imprime al principio de todos los metodos donde se incluya la clase Departament");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Esto se imprime al final de todos los metodos del Departamento");
	}


}
