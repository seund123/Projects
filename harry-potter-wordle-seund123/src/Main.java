import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> f = new ArrayList<>();
        File file = new File("C:\\Users\\user\\Desktop\\database.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            f.add(input.nextLine());
        }
        Random random = new Random();
        int answerline = random.nextInt(f.size());



        WordleGame game = new WordleGame(f.get(answerline));
        while (!game.isOver()) {
            System.out.print("Guess the wordle (upper case letter only, please): ");
            Scanner sc = new Scanner(System.in);
            try {

                String guess = sc.nextLine();
                String g = game.guess(guess);
                System.out.println(g);
            } catch (InvalidInputException e) {
                System.out.println(e);
            }
        }
    }
}