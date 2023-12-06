package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Tobeto!");
        String middleText = "İlginizi çekebilir.";
        String bottomText = "Vade Süresi";
        //Değişken isimleri camelCase olarak yazılır.
        System.out.println(middleText +" "+ bottomText);
        //Primitive data types
        int maturity = 12;
        double dollarYesterday = 18.10;
        double dollarToday = 18.30;
        boolean didTheDollarFall = true; // ya true ya da false döndürür
        String arrowDirection = "";
        if (dollarToday<dollarYesterday){
            arrowDirection = "down.svg";
            System.out.println("Dolar düştü." +"  -----=> "+ arrowDirection);
        } else if (dollarToday>dollarYesterday) {
            arrowDirection = "up.svg";
            System.out.println("Dolar yükseldi." +"  -----=> "+ arrowDirection);
        } else {
            arrowDirection = "equal.svg";
            System.out.println("Dolar eşit." +"  -----=> "+ arrowDirection);
        }

        //Array
        System.out.println("-----------------------------------");
        String[] credits = new String[] {"Hızlı Kredi","Maaşın Halkbanktan","Mutlu Emekli"};
        System.out.println("El ile :");
        System.out.println(credits[0]);
        System.out.println(credits[1]);
        System.out.println(credits[2]);
        System.out.println("-----------------------------------");
        System.out.println("Döngülerle : ");
        for(int i=0;i< credits.length;i++){
            System.out.println(credits[i]);
        }



    }
}