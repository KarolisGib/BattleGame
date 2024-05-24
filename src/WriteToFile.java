import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void writeToFile() {
        try {
            FileWriter myWriter = new FileWriter("Save Game.txt");
//            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.write("Hero weapon is: " + Methods.heroWeapon.getName());
            myWriter.write("Hero weapon damage is: " + Methods.heroWeapon.getDamage());
            myWriter.write("Enemy weapon is: " + Methods.enemyWeapon.getName());
            myWriter.write("Enemy weapon damage is: " + Methods.enemyWeapon.getDamage());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
