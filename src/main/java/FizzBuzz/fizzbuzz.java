package FizzBuzz;

public class fizzbuzz {




    public static String de(int nbr) {
        if (nbr % 3 == 0 && nbr % 5 == 0) {
            return "FizzBuzz";
        }
        if (nbr % 3 == 0) {
            return "Fizz";
        }
        if (nbr % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(nbr);
    }




}
