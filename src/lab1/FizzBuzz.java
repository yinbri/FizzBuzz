package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {
    public static void main(String[] args) {
        int i =  1;
        while (i<=100){
            i = doFizzBuzz(i);

        }
    }

    private static int doFizzBuzz(int i) {
        boolean isDivisibleByThree = i % 3 == 0;
        boolean isDivisibleByFive = i % 5 == 0;

        if (isDivisibleByFive && isDivisibleByThree) {
            System.out.println("Fizz Buzz");
        } else if (isDivisibleByThree) {
            System.out.println("Fizz");
        } else if (isDivisibleByFive) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
        i++;
        return i;
    }
}