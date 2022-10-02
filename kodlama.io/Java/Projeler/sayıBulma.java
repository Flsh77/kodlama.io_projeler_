package Java.Projeler;

public class sayıBulma {
    public static void main(String[] args) {
        int[] sayılar = {1,2,5,7,9,0};
        int aranacak = 12;
        boolean isitCorrect = false;
        for (int i : sayılar) {
            if(aranacak == i){
                isitCorrect = true;
            }
        }

        if(isitCorrect){
            System.out.println(aranacak + " Sayısı listede bulunuyor.");
        }
        else{
            System.out.println(aranacak + " Sayısı listede bulunmuyor.");
        }






    }   
}
