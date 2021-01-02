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

//        System.out.println("\n=== TEST 2 : seller findByDepartment ===");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        list.forEach(System.out::println);
//
//        System.out.println("\n=== TEST 3 : seller findAll ===");
//        list = sellerDao.findAll();
//        list.forEach(System.out::println);
//
//
//        System.out.println("\n=== TEST 4 : seller insert ===");
//        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//        sellerDao.insert(newSeller);
//        System.out.println("Inserted! New id = " + newSeller.getId());
//
//        System.out.println("\n=== TEST 5 : seller update ===");
//        seller = sellerDao.findById(1);
//        seller.setName("Martha Wayne");
//        sellerDao.update(seller);
//        System.out.println("Updated completed");
//
//        System.out.println("\n=== TEST 6 : seller delete ===");
//        System.out.print("Enter id for delete test: ");
//        int id = sc.nextInt();
//        sellerDao.deleteById(id);
//        System.out.println("Delete completed");

        sc.close();
    }
}
