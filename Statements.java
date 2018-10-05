public class Statements {
    public static void main(String[] args) {
        byte brain;
        short steve = 0;
        int irene = 1;
        long lex = 4;
        float fred;
        double donna;
        char colin;
        boolean bob = true;
        isPrime(irene);

        int primeCount = 0;

        for (int primeToTest = 2; primeCount < 100; primeToTest++){
            if (isPrime(primeToTest)){
                System.out.println(primeToTest);
                primeCount = primeCount +1;
            }
        }

//        int primeToTest = 2;
//
//        while (primeCount<100) {
//            if (isPrime(primeToTest)) {
//                System.out.println(primeToTest);
//                primeCount = primeCount + 1;
//            }
//            primeToTest++;
//        }


    }

    private static boolean isPrime(int value) {
        if (value < 2) {
            return false;
        }
        if (value == 2) {
            return true;
        }
        for (int i = 2; i < value; i++) {
            // i is for increment. it starts at 2. stop at 4 and increased by 1
            if (value % i == 0) {
                //System.out.println(" it is not a prime");
                //System.out.println(i);
                return false;
            }

        }
        return true;
    }
}

