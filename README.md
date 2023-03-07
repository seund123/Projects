# projects
#CODE TO TRANSLATE EVALUATE AND VALIDATE EQUATIONS USING STACKS MAIN 




import java.util.Stack;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        String filename = "C:\\Users\\user\\Desktop\\equations.txt";

        try (FileReader fr = new FileReader(filename); BufferedReader br = new BufferedReader(fr)) {
            String eg;
            while ((eg = br.readLine()) != null) {
                boolean isValid = validateme(eg);
                System.out.println("Equation: " + eg);
                System.out.println("Valid: " + isValid);
                if (isValid) {
                    translateme(eg);
                    int result = evaluateme("12/23+2/*");
                      System.out.println("Result: " + result);
                } else {
                    System.out.println("Skipping translation and evaluation due to invalid equation.");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static boolean validateme (String eg){
        stack s = new stack();
        s.init();
        boolean isgood = true;
        int j;
        char c;
        for(j=0; j<eg.length(); j++){
            c = eg.charAt(j);
            if (c=='('){
                s.push(c);
            } else if (c==')') {
                if (s.isStackEmpty()==true){
                    isgood = false;
                }
                else {
                    s.pop();
                }
                if (s.isStackEmpty()== false) {
                    isgood = false;
                }
            }
        }
        return isgood;
    }
     static void translateme(String eg){
        stack post= new stack();
        stack op = new stack();
        char c;
        int j;
        char myop;
        post.init();
        op.init();
        for (j=0;j<eg.length();j++){
            c= eg.charAt(j);
            if ((c>= '0') && (c<='9')){
                post.push(c);
            } else if ((c=='+')||(c=='-')||(c=='*')||(c=='/')) {
               op.push(c);
            } else if (c==')') {
                myop = op.pop();
                post.push(myop);
            }
        }while (op.isStackEmpty()==false){
            myop=op.pop();
            post.push(myop);
        }
        post.showStack();
     }
    public static int evaluateme(String eg){
        Stack<Integer> s = new Stack<Integer>();
        char c ;
        int j;
        int mynumber, x, y, z ;
        int answer = 0;

        for (j=0;j<eg.length();j++){
           c = eg.charAt(j);
            if ((c >='0')&&(c <='9')){
                mynumber = (int)c- (int)'0';
                s.push(mynumber);
            }
            else if (c=='+' || c=='-' || c=='*' || c=='/') {
                y = s.pop();
                x = s.pop();
                if(c=='+') {
                    z = x+y;
                }
                else if (c=='-') {
                    z = x-y;
                }
                else if (c=='*') {
                    z = x*y;
                }
                else {
                    z = x/y;
                }
                s.push(z);

        }}
answer = s.pop();
        return answer;
    }
}
