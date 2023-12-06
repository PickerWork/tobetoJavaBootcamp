package org.example;

import java.util.ArrayList;
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

        if(1==1){
            System.out.println("Koşul doğru..");
            System.out.println(numbers); //(Scope) Burada kullanabiliriz fakat
            String scopeText = "Deneme";
            System.out.println(scopeText);//Bunu if bloğunun dışında kullanamıyoruz...
            System.out.println(staticNumber); //Burada da main classı kullanbiliyoruz.If bloğundaki veriyi main classın ya da main methodun içine taşıyamıyoruz.

        }else {
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



    }
}