import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
String originalMsg = "Hello";

Encoder enc = new Encoder();
int offset = 5 ;
int[] encodedMsg = enc.encode(originalMsg,offset);
        System.out.println(Arrays.toString(encodedMsg));


       int[] secreteMessage = encodedMsg;
        // int[] secreteMessage = Encoder.encode(encodedMsg,offset);
        Decoder dec = new Decoder();
        String decodedMsg = dec.decode(secreteMessage, offset);
       System.out.println( decodedMsg);

    }

}