package com.company.shopno;

public class ShawpnoCounter {
    public static void main(String[] args) {
        System.out.println("Swapno Counter is open now");
        Product product1 = new Product(1001, "Sunsilk Shampoo", 500, 600);
        Product product2 = new Product(1002, "Maggie noodles", 120, 50);
        Product product3 = new Product(1003, "Chicken", 240, 2);
        Product product4 = new Product(1004, "Sauce", 200, 3);
        Product product5 = new Product(1005, "Chocolate", 155, 0.6);

        Branch branch3 = new Branch(4003,"Malibag");
        Branch branch1 = new Branch(4001,"Dania");
        Branch branch2 = new Branch(4002,"Khilgaon");

        Manager manager1 = new Manager(
                10820,
                branch3,
                2,
                "Arman",
                "12 Dec 1985",
                "Male",
                "O+",
                "01910775655",
                "Dhaka"
        );



        Employee emp1 = new Employee(
                10000,
                branch1,
                1,
                "Nurul Amin",
                "12 Dec 1970",
                "Male",
                "AB+",
                "01910778110",
                "Rangpur"
                );



        System.out.println("--------------------------");
        System.out.println("Employee 1: ");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Date Of birth: " + emp1.getDob());
        System.out.println("Phone Number: " + emp1.getPhoneNumber());
        System.out.println("Employee ID: " + Employee.getEmployeeId());
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Branch: " + emp1.getBranch().getBranchName());

        System.out.println("--------------------------");

        Employee emp2 = new Employee(
                10820,
                branch2,
                2,
                "Arman",
                "12 Dec 1985",
                "Male",
                "O+",
                "01910775655",
                "Dhaka"
        );

        System.out.println("--------------------------");
        System.out.println("Employee 2: ");
        System.out.println("Name: " + emp2.getName());
        System.out.println("Date Of birth: " + emp2.getDob());
        System.out.println("Phone Number: " + emp2.getPhoneNumber());
        System.out.println("Employee ID: " + Employee.getEmployeeId());
        System.out.println("Salary: " + emp2.getSalary());
        System.out.println("Branch: " + emp2.getBranch().getBranchName());
        System.out.println("--------------------------");

        Person person1 = new Employee(10820,
                branch2,
                2,
                "Mishir",
                "12 Dec 1985",
                "Male",
                "O+",
                "01910775655",
                "Dhaka");

//        IDiscount discount = new Discount(12);
        SpecialDiscount specialDiscount = new SpecialDiscount(200);

        Customer customer1 = new Customer(3001,"Prity","08/12/2001",branch1);
        LoyalCustomer loyalCustomer = new LoyalCustomer(3001,"Maruf","08/12/2001",branch1);

        Basket basket1 = new Basket(2001,customer1);
        basket1.addProduct(product1);
        basket1.addProduct(product2);
        basket1.addProduct(product5);
        basket1.addProduct(product3);
        basket1.addProduct(product4);
        System.out.println("Customer name: " + basket1.getCustomer().getName());
        System.out.println("Branch name: " + basket1.getCustomer().getBranch().getBranchName());
        System.out.println("Number of products: " + basket1.getNumberOfProduct());
        double totalBill =  basket1.calculateBill();
        System.out.println("Total Bill: " + totalBill + " BDT");

        double discountAmount = specialDiscount.calculateDiscount(loyalCustomer);
        System.out.println("Discount: " + discountAmount + " BDT");

        double payableAmount = totalBill - discountAmount;
        System.out.println("You have to pay: " + payableAmount + " BDT");

        System.out.println("Your Product List: ");
        basket1.showProducts();

    }
}
