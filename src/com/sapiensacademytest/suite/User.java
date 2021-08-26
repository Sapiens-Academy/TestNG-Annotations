package com.sapiensacademytest.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class User {
	@Test(groups= {"add", "functional", "smoke"})
	public void clickToAddUser() {
		System.out.println("Este metodo tiene el c�digo de a�adir un usuario");
	}
	
	@Test(groups= {"smoke"})
	public void clickToRemoveUser() {
		System.out.println("Este metodo tiene el c�digo de remover un Usuario");
	}
	
	@Parameters({"URL", "userName"})
	@Test(groups= {"smoke"})
	public void clickOnUser(String urlName, String username) {
		System.out.println("Este metodo tiene el c�digo para hacer clic sobre el Usuario " + username +
				" en la p�gina: " + urlName);
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
