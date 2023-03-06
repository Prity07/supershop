package com.company.meena_Bazar;

public class MeenaCounter {
    public static void main(String[] args) {

        System.out.println("Meena Bazar is open NOW!");
        System.out.println("---------------");
        Product product1 = new Product(101, "Mango_Juice", "1L", 380);
        Product product2 = new Product(102, "Pasta", "50g", 250);
        Product product3 = new Product(103, "Bread", "20g", 540);
        Product product4 = new Product(104, "Soap", "30g", 960);

        Branch branch1 = new Branch(401,"Jatrabari");

        Manager manager1 = new Manager("Service Manager",
                10500,
                branch1,
                501,
                "Rubel",
                "5 Nov 1982",
                "Male",
                "O+",
                "01995358872",
                "Dhaka");

        Employee emp1 = new Employee(
                10500,
                branch1,
                501,
                "Rubel Ahmed",
                "5Nov 1982",
                "Male",
                "O+",
                "01995358872",
                "Dhaka");

        System.out.println("Employee 1");
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Branch: " + emp1.getBranch().getBranchName());
        System.out.println("EmployeeId: " + emp1.getId());
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Date of Birth: " + emp1.getDob());
        System.out.println("Gender: " + emp1.getGender());
        System.out.println("BloodGroup: " + emp1.getBloodGroup());
        System.out.println("Phone Number: " + emp1.getPhoneNumber());
        System.out.println("City: " + emp1.getCity());
        System.out.println("----------------");


        Employee emp2 = new Employee(
                15000,
                branch1,
                502,
                "Ameena Nazmun",
                "5Nov 1999",
                "Female",
                "A+",
                "01995358872",
                "Rangpur");

        System.out.println("Employee 2");
        System.out.println("Salary: " + emp2.getSalary());
        System.out.println("Branch: " + emp2.getBranch().getBranchName());
        System.out.println("EmployeeId: " + emp2.getId());
        System.out.println("Employee Name: " + emp2.getName());
        System.out.println("Date of Birth: " + emp2.getDob());
        System.out.println("Gender: " + emp2.getGender());
        System.out.println("BloodGroup: " + emp2.getBloodGroup());
        System.out.println("Phone Number: " + emp2.getPhoneNumber());
        System.out.println("City: " + emp2.getCity());
        System.out.println("----------------");

        IDiscount discount1 = new Discount(10);

        SpecialDiscount specialDiscount = new SpecialDiscount(20);

        Customer customer1 = new Customer(301,"Rina Khan", "1 Dec 2010",branch1);
        LoyalCustomer loyalCustomer = new LoyalCustomer(601,"Tahsin Prity",
                "8 Dec 2001",branch1);


        Basket basket1 = new Basket(201, customer1);
        basket1.addProduct(product1);
        basket1.addProduct(product2);
        basket1.addProduct(product3);
        basket1.addProduct(product4);


        System.out.println("Customer Name: " + basket1.getCustomer().getName());
        System.out.println("Branch Name: " + basket1.getCustomer().getBranch().getBranchName());

        System.out.println("Number of Products: " + basket1.getNumberOfProduct());

        double totalBill = basket1.calculateBill();
        System.out.println("Totalbill: " + totalBill + "BDT");

        double discountAmount = specialDiscount.calculateDiscount(loyalCustomer);
        System.out.println(discountAmount);//1010

        double payableAmount = totalBill-discountAmount;
        System.out.println(payableAmount);


        System.out.println("-----------");

        System.out.println("Your Product List: ");
        basket1.showProduct();



    }


}
