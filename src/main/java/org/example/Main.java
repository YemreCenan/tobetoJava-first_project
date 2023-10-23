package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");


        String centerText = "İlginizi Çekebilir";
        String bottomText = "Veda Süresi";

        System.out.println(centerText);


        //integer
        int maturity = 12;

        double usdYesterday = 18.25;
        double usdToday = 18.30;

        boolean usdDown = false;

        String arrowDirection = "";

        if (usdToday < usdYesterday) {
            arrowDirection = "down.svg";
            System.out.println(arrowDirection);

        } else if (usdToday > usdYesterday) {
            arrowDirection = "up.svg";
            System.out.println(arrowDirection);

        } else {
            arrowDirection = "equal.svg";
            System.out.println(arrowDirection);

        }

        String[] credit = {"Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli"};

        for (int i = 0; i < credit.length; i++) {

            System.out.println(credit[i] + "\n");
        }

        for (String creditStr : credit) {

            System.out.println(creditStr);
        }

    }
}
