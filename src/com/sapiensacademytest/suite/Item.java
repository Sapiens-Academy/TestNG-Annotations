package com.sapiensacademytest.suite;

import org.testng.annotations.Test;

public class Item {
	
	@Test
	public void addItem() {
		System.out.println("Este metodo tiene el c�digo de a�adir un articulo al inventario");
	}
	
	@Test
	public void removeItem() {
		System.out.println("Este metodo tiene el c�digo de remover un articulo del inventario");
	}
	
	@Test
	public void clickOnItem() {
		System.out.println("Este metodo tiene el c�digo para hacer clic sobre un articulo del inventario");
	}

	@Test
	public void modifyItem() {
		System.out.println("Este metodo tiene el c�digo para modificar un articulo del inventario");
	}

}
