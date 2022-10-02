package Java.Projeler;

public class asalSayı {

    public static void main(String[] args){
        int number = 23;
        boolean isPrime = true;
        for (int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }

        if(isPrime == true){
            System.out.println(number + " " +"Sayısı Asal Sayıdır.");
        }
        else {
            System.out.println(number + " " +"Sayısı Asal Değildir.");
        } 





    }



}
