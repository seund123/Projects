public class stack {
    int top;
    char d[] = new char[32];


    void init() {
        top = -1;
    }

    void push(char c) {
        top++;
        d[top] = c;
    }

    char pop() {
        char c;
        c = d[top];
        top--;
        return c;
    }
    boolean isStackEmpty(){
        boolean answer = false;
        if (top==-1){
            answer=true;
        }
        return answer;
    }
    void showStack(){
        int j;
        for (j=0;j<=top;j++){
            System.out.print(d[j] + "");
        }
        System.out.println();
    }
}