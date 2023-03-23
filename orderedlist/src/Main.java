import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Main {

    public static void main(String[] args) {
        index indexs = new index();
        nametonum k = new nametonum();
        linkme l = new linkme();
       try{ String fname;
        File txtfile;
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter file name please");
        fname = userinput.nextLine();
        txtfile  = new File("src\\" + fname);
        Scanner fileinput = new Scanner(txtfile);
            while (fileinput.hasNextLine()) {
                String name = fileinput.nextLine();
                int namecode = k.convert(name);
                l.insert(name, namecode);

                indexs.arrindex();
                indexs.addToIndex(name);
            }

       } catch (FileNotFoundException e) {
           System.out.println("WE NO FIND YOUR FILE OOO");
       }

        Scanner indexstuff = new Scanner(System.in);
        System.out.println("what section of  the list would you like to see?");
        Character letter = indexstuff.next().charAt(0);
        System.out.println("you entered "+ letter);
        indexs.printNames(letter);

        Scanner deletename = new Scanner(System.in);
        System.out.println("what name do you want to delete? ");
        String nameo = deletename.nextLine();
        l.deleteafter(l.findSpot(nameo));

        l.listcount();
        l.showlist();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting letter:");
        char startLetter = input.next().charAt(0);
        indexs.Length(startLetter);
    }
}

