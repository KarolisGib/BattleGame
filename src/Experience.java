import java.util.Scanner;

public class Experience {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int currentLevel = 1;
        int nextLevel = currentLevel + 1;
        int base = 30;
        int currentExp = 0;
        int fightsCounter = 0;


        while (currentLevel < nextLevel) {
            int levelUpExp = (currentLevel + nextLevel) * base;
            System.out.println("Next lvl xp: " + levelUpExp);
            currentExp = currentExp + 10;
            fightsCounter++;


            System.out.println("Exp: " + currentExp);

            if (currentExp >= levelUpExp) {
                currentLevel++;
                currentExp = 0;
            }
            System.out.println("Level: " + currentLevel);
//            System.out.println("Fight again (y/n)?");
//            String playAgain = scanner.nextLine();
//            9 15 21 27 33 39 45
//            90 150 210 270
//            if (currentLevel == 3) {
//                break;
//            }
        }
        System.out.println("It took " + fightsCounter + " fights to level up");
    }
}
