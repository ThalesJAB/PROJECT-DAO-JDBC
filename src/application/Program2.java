package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("============= TEST 1: Department findAll =================");
		departmentDao.findAll().forEach(System.out::println);
		
		
		System.out.println("\n===============TEST 2: Department findById ===============");
		System.out.println(departmentDao.findById(2));
		
		System.out.println("\n======== TEST 3: Department insert ========");
		Department newDep = new Department(null, "Games");
		departmentDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());
		

	}

}
