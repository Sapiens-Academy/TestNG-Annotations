package com.sapiensacademytest.suite;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Item {
	
	@Test(groups= {"add"})
	public void addItem() {
		System.out.println("Este metodo tiene el código de añadir un articulo al inventario");
	}
	
	@Test
	public void removeItem() {
		System.out.println("Este metodo tiene el código de remover un articulo del inventario");
	}
	
	
	@Test(dataProvider="getData")
	public void clickOnItem(String nombreProducto, String precioProducto) {
		System.out.println("Se ha hecho clic sobre "+ nombreProducto + 
				", con el precio: " + precioProducto);
	}

	@Test
	public void modifyItem() {
		System.out.println("Este metodo tiene el código para modificar un articulo del inventario");
		Assert.assertTrue(false);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object [][] productos = new Object [3][2];
		
		//Articulo 1
		productos [0][0] = "Camisa"; 
		productos [0][1] = "$10,00"; 

		//Articulo 2
		productos [1][0] = "Pantalon"; 
		productos [1][1] = "$20,00"; 

		//Articulo 3
		productos [2][0] = "Falda"; 
		productos [2][1] = "$15,00";
		
		return productos;

	}

}
