/*Create an user defined exception named CheckArgument to check
the number of arguments passed through command line. If the number of arguments is
less than four then throw the Check Argument exception, else print the addition of squares
of all the four elements.*/


class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class Main5 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Error: At least 4 arguments are required!");
            }

            int sum = 0;
            for (int i = 0; i < 4; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num * num;
            }

            System.out.println("Sum of squares of first four arguments: " + sum);

        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integer arguments.");
        }
    }
}