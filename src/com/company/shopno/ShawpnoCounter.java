package com.company.shopno;

public class ShawpnoCounter {
    public static void main(String[] args) {
        System.out.println("Swapno Counter is open now");
        Product product1 = new Product(1001, "Sunsilk Shampoo", 500, 600);
        Product product2 = new Product(1002, "Maggie noodles", 120, 50);
        Product product3 = new Product(1003, "Chicken", 240, 2);
        Product product4 = new Product(1004, "Sauce", 200, 3);
        Product product5 = new Product(1005, "Chocolate", 155, 0.6);


        Manager manager1 = new Manager(5001,"Maruf",50000);
        Branch branch1 = new Branch(4001,"Malibag",manager1);
        Customer customer1 = new Customer(3001,"Prity","08/12/2001",branch1);

        Basket basket1 = new Basket(2001,customer1);
        basket1.addProduct(product1);
        basket1.addProduct(product2);
        basket1.addProduct(product5);
        basket1.addProduct(product3);
        basket1.addProduct(product4);
        System.out.println("Customer name: " + basket1.getCustomer().getName());
        System.out.println("Branch name: " + basket1.getCustomer().getBranch().getBranchName());
        System.out.println("Manager: " + basket1.getCustomer().getBranch().getManager().getManagerName());
        System.out.println("Number of products: " + basket1.getNumberOfProduct());
        System.out.println("Total Bill: " + basket1.calculateBill() + " BDT");
        System.out.println("Your Product List: ");
        basket1.showProducts();

    }
}
