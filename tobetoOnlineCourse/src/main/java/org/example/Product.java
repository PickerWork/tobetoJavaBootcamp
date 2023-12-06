package org.example;

//Her class default olarak  boş constructor ile başlar.
public class Product {
    public Product (){
        System.out.println("Boş ctor çalıştırıldı.");
    }
    //Overloading(Contsructor)
    public Product(String name,double price){
        //System.out.println("Name parametresi ile çalıştırıldı.");
        //this classa referans eder
        /*if(name.length()<3){

        }*/
        this.name = name;
        this.price = price;
    }
    //getter - setter
    //okuma - yazma public fonksiyon

    //Sadece getter varsa read-only(sadece okunabilir)
    //Sadece setter varsa write-only(sadece yazılır)


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //private özel => attribute class dışında hiçbir yerde kullanamazsın (get/set)
    private String name;
    private double price;
    // erişim belirteci dönüş_tipi method_ismi(){}
    public void discount(double discount){
        price = price - discount;
    }
    //method overloading => aynı isimde farklı imzada n kadar methoda sahip olmak.
    /*public void discount(double discount ,int percent){
        price = price - discount;
    }*/

}
