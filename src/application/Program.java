package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Department d1 = new Department("Books",1);
		Seller s1 = new Seller("Davi", 12,"davi@gmail.com", new Date(), 2900.0, d1);
		
		
		
		System.out.println(s1);
	}

}
