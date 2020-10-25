package application;

import java.sql.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {



	public static void main(String[] args) {
		Department obj = new Department (1, "Books");
		
		Seller seller = new Seller (21, "bob", "henrique@gmail.com", new Date(0), 3333.0, obj );
		
		System.out.println(seller);
		
		
	}

}
