public class Decoder {
    public String decode(int[] secretMessage) {
       String arr = "";
        for (int i = 0; i < secretMessage.length; i++) {
            arr += (char) (secretMessage[i]);

        }
        return arr;

    }
    public String decode(int[] secretMessage, int offset){
        String arr = "";
        for (int i = 0; i < secretMessage.length; i++) {
            arr += (char) (secretMessage[i]- offset);

        }
        return arr;




    }
}