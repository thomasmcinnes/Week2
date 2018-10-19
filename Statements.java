import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Statements {
    private static final Object Prime1000 = getPrime1000;

    public static void main(String[] args)throws Exception
    {
        //int irene = 0;
        //isPrime(irene);

        int primeCount = 0;
        File Prime1000 = new getPrime1000("C:\\Users\\thomas.mcinnes\\Documents\\Prime numbers\\Prime1000.txt");

        BufferedReader br = new BufferedReader(new FileReader(Prime1000));

        //String st;
        while ((br.readLine()) != null)
            //System.out.println(st);


        for (int primeToTest = 2; primeCount < 1000; getPrime1000++){
            /* Prime to Test is the value we are testing to see if it is a prime. We are starting at 2
               Prime count is the amount of prime number
               Prime to Test is value plus one each time to check if it is a prime
            */
           if (isPrime(primeToTest)){
                System.out.println(primeToTest);
                primeCount = primeCount +1;
            }
        }

    }

    private static boolean isPrime(int value) {
        if (value < 2) {
            return false;
            //less than two - false
        }
        if (value == 2) {
            return true;
            //if equals to 2 that fine
        }
        for (int i = 2; i < value; i++) {
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

