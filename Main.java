import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception  {

        // pass the path to the file as a parameter
        FileReader fr =
                new FileReader("C:\\Users\\thomas.mcinnes\\Documents\\Prime Numbers\\Prime1000.txt");

        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char) i);

        int primeCount = 0;

        int t;
        for (int primeToTest = 13; primeCount < 10; i++) {
            /* Prime to Test is the value we are testing to see if it is a prime. We are starting at 2
               Prime count is the amount of prime number
               Prime to Test is value plus one each time to check if it is a prime
            */
            if (isPrime(primeToTest)) {
                System.out.println(primeToTest);
                primeCount = primeCount + 1;
            }
        }

    }

    public static boolean isPrime(int value) {
        if (value < 2) {
            return false;
            //less than two - false
        }
        if (value == 2) {
            return true;
            //if equals to 2 that fine
        }
        for (int t = 2;t < value; t++) {
            // i is for increment. it starts at 2. stop at the value and increased by 1
            if (value % i == 0) {
                //System.out.println(" it is not a prime");
                //System.out.println(i);
                return false;
            }

        }
        return true;
    }


}
