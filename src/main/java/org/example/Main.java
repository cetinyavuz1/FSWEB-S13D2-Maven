package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberToWords(1909));
    }
    public static boolean isPalindrome(int sayi){
        sayi = Math.abs(sayi);
        String[] rakamlar = Integer.toString(sayi).split("");
        String ters = "";
        for(int i = rakamlar.length - 1; i >= 0; i--){
            ters += rakamlar[i];
        }

        return Integer.toString(sayi).equals(ters);
    }
    public static boolean isPerfectNumber(int sayi){
        if(sayi < 0){
            return false;
        }
        int toplam = 0;

        for(int i = 1; i <= sayi/2; i++){
            if(sayi % i == 0){
                toplam += i;
            }
        }
        return toplam == sayi;
    }
    public static String numberToWords(int sayi){
        if(sayi < 0){
            return  "Invalid Value";
        }
        String[] rakamlar = String.valueOf(sayi).split("");
        String numToText = "";

        for(int i = 0; i < rakamlar.length; i++){
            switch (rakamlar[i]){
                case "0":
                    numToText += "Zero ";
                    break;
                case "1":
                    numToText += "One ";
                    break;
                case "2":
                    numToText += "Two ";
                    break;
                case "3":
                    numToText += "Three ";
                    break;
                case "4":
                    numToText += "Four ";
                    break;
                case "5":
                    numToText += "Five ";
                    break;
                case "6":
                    numToText += "Six ";
                    break;
                case "7":
                    numToText += "Seven ";
                    break;
                case "8":
                    numToText += "Eight ";
                    break;
                case "9":
                    numToText += "Nine ";
                    break;
            }
        }
        return numToText.trim();

    }
}
