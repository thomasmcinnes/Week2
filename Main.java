import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        String myFile = "C:\\Users\\thomas.mcinnes\\Documents\\Prime numbers\\1000.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile));
        List<String> primeNumbers = new ArrayList<>();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            primeNumbers.add(line);

        }
        bufferedReader.close();

        List<Integer> list = new ArrayList<>();
        for (String prime : primeNumbers) {
            list.add(Integer.parseInt(prime));
        }


        int primeCount = 0;


        for (int primeToTest = 2; primeCount < 100; primeToTest++) {
            /* Prime to Test is the value we are testing to see if it is a prime. We are starting at 2
               Prime count is the amount of prime number
               Prime to Test is value plus one each time to check if it is a prime
            */
            if (isPrime(primeToTest, list)) {
                System.out.println(primeToTest);
                primeCount = primeCount + 1;
            }
        }
    }

    public static boolean isPrime(int value, List<Integer> primeList) {
        if (value < 2) {
            return false;
            //less than two - false
        }
        if (value == 2) {
            return true;
            //if equals to 2 that fine
        }
        for (int t = 0; t < primeList.size(); t++) {
            // i is for increment. it starts at 2. stop at the value and increased by 1
            if (value % primeList.get(t) == 0) {
                //System.out.println(" it is not a prime");
                return false;
            }
            return true;
        }
        return isHigherPrime(value);
    }

    private static boolean isHigherPrime(int value) {
        return false;
    }
}

