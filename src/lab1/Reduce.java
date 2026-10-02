package lab1;

public class Reduce {
    public static void main(String[] args){
        System.out.println(reduce(100));
    }


    public static int reduce(int b){
        int counter = 0;
        while (b>0){
            if (b%2==0) {
                b = b/2;
            } else {
                b--;
            }
            counter++;
        }
        return counter;
    }
}
