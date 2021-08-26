package com.sapiensacademytest.suite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cart {
	
	@Test(groups= {"add"})
	public void addItemOnCart() {
		System.out.println("Este metodo tiene el código de añadir un articulo al carrito");
	}
	
	@Test(enabled=true)
	public void removeItemOnCart() {
		System.out.println("Este metodo tiene el código de remover un articulo del carrito");
	}
	
	@Test
	public void clickOnItemOnCart() {
		System.out.println("Este metodo tiene el código para hacer clic sobre un articulo del carrito");
	}
	
/*	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Codigo antes del metodo");		
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Codigo despues del metodo");		
	} */

	@Test
	public void modifyItemOnCart() {
		System.out.println("Este metodo tiene el código para modificar un articulo del carrito");
	}

}
