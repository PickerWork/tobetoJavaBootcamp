package org.example;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        //set value
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.img");
         //get
        //System.out.println(product1.name);

        Product product2 = new Product();
        //set value
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.img");

        Product product3 = new Product();
        //set value
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.img");

        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>" + "   " + product.getUnitPrice());
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05550505550");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Yasin");
        individualCustomer.setLastName("Yıldız");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("0543434343");
        corporateCustomer.setTaxNumber("11111111111");
        corporateCustomer.setCustomerNumber("54331");

        Customer[] customers = {individualCustomer,corporateCustomer};

    }
}