package com.sapiensacademytest.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class User {
	@Test
	public void clickToAddUser() {
		System.out.println("Este metodo tiene el c�digo de a�adir un usuario");
	}
	
	@Test
	public void clickToRemoveUser() {
		System.out.println("Este metodo tiene el c�digo de remover un Usuario");
	}
	
	@Test
	public void clickOnUser() {
		System.out.println("Este metodo tiene el c�digo para hacer clic sobre un Usuario");
	}

	@Test
	public void modifyUser() {
		System.out.println("Este metodo tiene el c�digo para modificar Usuario");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Esto se imprime al principio de todos los metodos");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Esto se imprime al final de toda la suite los metodos");
	}

}
