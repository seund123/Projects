public class Main {
    static int counter = 0;
    public static void main(String[] args){
        int n = 6;
        towersofHanoi(n , 'A' , 'B', 'C');
        System.out.println("moves " + counter);
    }
    static void towersofHanoi (int n , char from, char helper, char target){
        counter++;
        if (n==1){
            System.out.println(" move from "+ from +" to "+ target );
           return;
    }
    towersofHanoi(n-1,from,target,helper);
        System.out.println("move from " + from + " t0 " + target);

        towersofHanoi(n-1, helper , from , target);

}
}