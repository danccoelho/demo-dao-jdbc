package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentdao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentdao.findById(1);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list = departmentdao.findAll();
		for(Department d:list) {
			System.out.println(d);
		}
		
		System.out.println("\n=== TEST 3: department insert ===");
		Department departmentt = new Department("Musica", 5);
		departmentdao.insert(departmentt);
		System.out.println("Inserted! New id");
		
		System.out.println("\n=== TEST 4: department update ===");
		Department departmentt2 = departmentdao.findById(1);
		departmentt2.setName("Business");
		departmentdao.update(departmentt2);
		System.out.println("Update completed! ");
		
		System.out.println("\n=== TEST 5: department delete ===");
		System.out.print("Enter Id for delete: ");
		int id = sc.nextInt();
		departmentdao.deleteById(id);
		System.out.println("Delete completed! ");
		
		
		sc.close();
	}

}
