import java.util.Random;

public class crapsGame {
    public static void main(String[] args) {
        Random random = new Random();

        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        int sum = die1 + die2;

        System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);

        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose");
        } else if (sum == 7 || sum == 11) {
            System.out.println("You win");
        } else {
            int point = sum;
            System.out.println("point is " + point);
            while (true) {
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                sum = die1 + die2;

                System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);

                if (sum == point) {
                    System.out.println("You win");
                    break;
                } else if (sum == 7) {
                    System.out.println("You lose");
                    break;
                }
            }
        }
    }
}

