package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp= new Department(3, "Books");
		
		
		
		Seller seller = new Seller(21, "Thales", "thales@gmail.com", new Date(), 2000.0, dp);
		
		System.out.println(seller);
		
	}

}
