package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("============= TEST 1: Department findAll =================");
		departmentDao.findAll().forEach(System.out::println);
		
		
		System.out.println("\n===============TEST 2: Department findById ===============");
		System.out.println(departmentDao.findById(2));
		
		/*
		System.out.println("\n======== TEST 3: Department insert ========");
		Department newDep = new Department(null, "Games");
		departmentDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());
		*/
		System.out.println("\n=== TEST 4: Department update =====");
		Department dep = departmentDao.findById(1);
		dep.setName("Tecnology");
		departmentDao.update(dep);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: Department delete =====");
		System.out.println("Enter id for delete test: ");
		int id = scanner.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		

	}

}
