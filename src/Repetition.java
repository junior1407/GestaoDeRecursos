public class Repetition {

    public static void main(String[] args) {

        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }


        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);


        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
    }


}
