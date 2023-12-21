class PrimeCalculator {

    int nth(int nth) {
        if (nth < 1) throw new IllegalArgumentException("n must be greater than 0");
        int number = 1;
        int primeCount = 0;

        while(primeCount < nth){
            if(isPrime(++number))
                primeCount++;
        }
        return number;
    }

    boolean isPrime(int number)
    {
        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0)
                return false;

        return true;
    }

}
