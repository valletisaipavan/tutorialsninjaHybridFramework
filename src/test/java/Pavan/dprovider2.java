package Pavan;

import org.testng.annotations.DataProvider;

public class dprovider2 {
	@DataProvider(name="pavan")
	public String[][] datasuppliers() {
		String[][] data = { { "amotooricap9@gmail.com", "12345" }, { "amotooricap1@gmail.com", "12345" }};
				 
         return data;
	
	}
}

