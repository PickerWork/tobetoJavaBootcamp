package org.example;

import org.example.models.Category;
import org.example.models.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int staticNumber = 0;

    public static void main(String[] args) {
        //Programlama Nedir?Elimizdeki ham verinin yönetilerek(dev) yazılım ürününe çevrilmesi.

        //Programming Concepts : Variables,OOP,Class

        //Type-Safe

        String text = "Merhaba,Tobeto";
        Integer number = 10; //Generic(Jenerik-Genel)
        int number2 = 20; //Primitive Type(ilkel)
        System.out.println(staticNumber);//(Scope) Yukarıda tanımladığımız main.classı burada kullanabiliyoruz.
        //Ram'de tutuluyor.(Geçiçi)

        System.out.println(text);
        System.out.println(number);
        System.out.println(number2);
        //System.out.println(scopeText); //(Scope) Hata veriyor..
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        //Scope => Kapsam,Alan

        if (1 == 1) {
            System.out.println("Koşul doğru..");
            System.out.println(numbers); //(Scope) Burada kullanabiliriz fakat
            String scopeText = "Deneme";
            System.out.println(scopeText);//Bunu if bloğunun dışında kullanamıyoruz...
            System.out.println(staticNumber); //Burada da main classı kullanbiliyoruz.If bloğundaki veriyi main classın ya da main methodun içine taşıyamıyoruz.

        } else {
            System.out.println("Koşul yanlış..");
        }
        //Scope içersinde tanımladığımız değişkenleri scope dışında tanımlayamıyoruz.Büyükten>küçüğe durumu var.

        //Şart Blokları(Condition Blocks)

        //İçersine kabul ettiği koşul ile bu koşulun sağlanıp,sağlanmama durumuna göre kod çalıştıran yapılar.

        //== != > < >= <=
        /*Küçüktür (<)
        Büyüktür (>)
        Küçük Eşittir (<=)
        Büyük Eşittir (>=)
        Eşittir (==)
        Eşit Değildir (!=)*/

        int number3 = 6;
        int number4 = 6;
        if (number3 > number4) { //boolean ==> true,false
            System.out.println("Number 3 daha büyük.");
        } else if (number3 > 5) {
            System.out.println("Number 3 5'ten büyüktür.");
        }else {
            System.out.println("******");
        }

        //**********************************************************************//

        if (number3 == number4) {
            System.out.println("Number eşittir.");

        }else {
            System.out.println("Number 3 daha küçük.");
        }
        // ** => Her if bloğundan sadece bir scope çalıştırılır.

        char state = 'A';
        switch (state){
            case 'A': //A olduğunda
                System.out.println("A durumu");
                break; //bitir.
            case 'B': //B olduğunda
                System.out.println("B durumu");
                break;
            case 'C': //C olduğunda
                System.out.println("C durumu");
                break;
            default:
                System.out.println("Bilinmeyen durumlar.");
                break;
        }

        //Primitive ve Reference Type
        //OOP intro

        //Primitive => Stack => a=10
        //Reference => @abc123 => heap @abc123={"Yasin","Engin"}
        int a = 5;
        int b = 1;
        b+=1;
        System.out.println(a);
        System.out.println(b);

        //Reference typler heapte tutulduğu için farklı bir listeyi eşleştirdiğimizde birbirini etkiler.
        //Primitive typler ise ayrı ayrı listelenir birbirinden etkilenmez.

        String[] names = {"Yasin","Asaf","Samet","Su","Teksen"};

        //Clone işlemi heapteki verinin üstüne veri ekleme işi yapar.
        String[] names2 = names.clone();
        //Alternatif aşağıdaki örnek yukarıdaki örnekle aynı işi yapar.
        //String[] names2 = Arrays.copyOf(names,names.length);

        System.out.println(names);
        System.out.println(names2);

        names2[0] = "Doğukan";

        System.out.println(names[0]);
        System.out.println(names2[0]);
        System.out.println("------------------------------------------");

        //iterasyon (döngü ile yazdırma)
        //i=index
        for (int i = 0; i < names2.length; i++) {
            System.out.println(names2[i]);
        }
        //Syntaxın kısaltılmış hali :
        //names2 içindeki her bir elemanı iterasyona uğrat ve her elemana name takma adını ver.
        System.out.println("------------------------------------------");
        for (String name:names2){
            System.out.println(name);
        }

        //OOP
        //Instance
        //Nesne = Product ------ Obje = Laptop,Mouse
        Product product = new Product("Laptop",5000);
        product.setName("Laptop");
        product.discount(10);

        //constructor => Yapıcı blok
        Product product1 = new Product("Mouse",10);
        product1.discount(5);

        System.out.println("------------------------------------------");

        Category category = new Category();
        Order order = new Order();
    }
}