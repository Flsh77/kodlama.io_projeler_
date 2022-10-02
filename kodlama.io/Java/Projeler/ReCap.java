package Java.Projeler;

public class ReCap {
    

    public static void main(String[] args) {
        double[] myLists = {1.2,6.3,4.3,5.6}; // double == flaot
        double max = myLists[0]; // 1.2
        double total = 0;




        for(double number : myLists) {
            if(max < number){
                max = number;
            }
            total = total + number;
            System.out.println(total);
            // System.out.println(list);
        }
        System.out.println("Max Number : " + max);
        System.out.println("Toplam : " + total);


    for(int i = 0; i < myLists.length;i++){
        System.out.println(myLists[i]);
    }
        














































    }


































}
