package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao depDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1 : Department findById ===");
        Department dep = depDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 2 : Department findAll ===");
        List<Department> list = depDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 3 : Department insert ===");
        Department newDep = new Department(null, "Música");
        depDao.insert(newDep);
        System.out.println("Inserted! New id = " + newDep.getId());

        System.out.println("\n=== TEST 4 : Department update ===");
        dep = depDao.findById(8);
        dep.setName("Informática");
        depDao.update(dep);
        System.out.println("Updated completed");

        System.out.println("\n=== TEST 6 : Department delete ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        depDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}
