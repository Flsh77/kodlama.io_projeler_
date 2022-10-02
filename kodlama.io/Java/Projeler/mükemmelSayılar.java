package Java.Projeler;

public class mükemmelSayılar {
    
    public static void main(String[] args) {
        int number = 28;
        int total = 0;
        boolean isNumber = false;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                total = total + i;
                if(total == number) {
                    isNumber = true;
                }
            }
        }

        if(isNumber == true) {
            System.out.println(number + " " + "Sayısı Mükemmel Sayıdır.");
        }
        else {
            System.out.println(number + " " + "Sayısı Mükemmel Sayı Değildir.");
        }











    }



}
