package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(null, 2);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller s : list) {
			System.out.println(s);
		}

		System.out.println("\n=== TEST 3: seller findAll ===");
		list = sellerDao.findAll();
		for (Seller s : list) {
			System.out.println(s);
		}
		
		//System.out.println("\n=== TEST 4: seller insert ===");
		//Seller newSeller = new Seller("Joao.C", null, "joaoc@gmail.com", new Date(), 4000.0, department);
		//sellerDao.insert(newSeller);
		//System.out.println("Inserted! new Id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Geromel");
		seller.setEmail("gerome@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed");
	}

}
