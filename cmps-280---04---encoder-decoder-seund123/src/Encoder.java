public class Encoder {
   public int[] encode(String msg){
       int[] arr = new int[msg.length()] ;
       for (int i = 0 ; i < msg.length(); i++ ){
           arr[i] = msg.charAt(i);
       }
        return arr;
    }
    public int[] encode(String msg, int offset){

        int[] arr = new int[msg.length()] ;
        for (int i = 0 ; i < msg.length(); i++ ) {
            arr[i] = msg.charAt(i) + offset;
        }
       return arr;


    }
}

/* int [] cn = msg.charAt();
//  for (int i = 0 ; i < msg.length(); i++ ) {
    cn[i] = msg.charAt(i); }*/

