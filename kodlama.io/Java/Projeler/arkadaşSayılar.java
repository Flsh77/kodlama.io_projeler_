package Java.Projeler;

public class arkadaşSayılar {
    public static void main(String[] args){
        int number1 = 6;
        int number2 = 5;
        int total = 0;
        int total_2 = 0;
        boolean isNumber = false;
        for (int i = 1; i < number1; i++){
            if(number1 % i == 0){
                total = total + i;
                if(total == number2){
                    isNumber = true;
                }
            }
        }

        for(int i = 1; i < number2; i++){
            if(number2 % i == 0){
                total_2 = total_2 + i;
                if(total_2 == number1){
                    isNumber = true;
                }
            }
        }

        if(isNumber == true){
            System.out.println(number1 + " ve " + number2 + " Arkadaş Sayılardır.");
        }
        else{
            System.out.println(number1 + " ve " + number2 + " Arkadaş Sayılar Değildir.");
        }



























    }
}
