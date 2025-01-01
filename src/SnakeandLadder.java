import java.util.Random;

public class SnakeandLadder {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int dieRoll = random.nextInt(6) + 1; // Generates a number between 1 and 6
//        System.out.println("Die rolled: " + dieRoll);
//    }

//    public static void main(String[] args) {
//        Random random = new Random();
//        int dieRoll = random.nextInt(6) + 1;
//        int option = random.nextInt(3); // 0: No Play, 1: Ladder, 2: Snake
//        int position = 0;
//
//        switch (option) {
//            case 0: // No Play
//                System.out.println("No Play. Current position: " + position);
//                break;
//            case 1: // Ladder
//                position += dieRoll;
//                System.out.println("Ladder! Move ahead to position: " + position);
//                break;
//            case 2: // Snake
//                position -= dieRoll;
//                position = Math.max(position, 0);
//                System.out.println("Snake! Move back to position: " + position);
//                break;
//        }
//    }

    public static void main(String[] args) {
        Random random = new Random();
        int position = 0;

        while (position < 100) {
            int dieRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            if (position + dieRoll > 100) {
                continue; // Skip if the position exceeds 100
            }

            switch (option) {
                case 0: // No Play
                    break;
                case 1: // Ladder
                    position += dieRoll;
                    break;
                case 2: // Snake
                    position -= dieRoll;
                    position = Math.max(position, 0);
                    break;
            }
            System.out.println("Current position: " + position);
        }
        System.out.println("Congratulations! You reached position 100.");
    }
}
