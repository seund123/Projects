public class nametonum {
    public int getletval(Character ch) {
        return (int) ch - (int) 'a'+1;
    }

    public int convert(String name) {
        double namecode = 0;
        if (name.length() == 3) {
             namecode = getletval(name.charAt(0)) * Math.pow(26, 4) + getletval(name.charAt(1)) * Math.pow(26, 3) +
                    getletval(name.charAt(2)) * Math.pow(26, 2);

        } else if (name.length() == 4){
            namecode = getletval(name.charAt(0)) * Math.pow(26, 4) + getletval(name.charAt(1)) * Math.pow(26, 3) +
                    getletval(name.charAt(2)) * Math.pow(26, 2) +  getletval(name.charAt(3)) * Math.pow(26, 1) ;
        }
        else {
            namecode = getletval(name.charAt(0)) * Math.pow(26, 4) + getletval(name.charAt(1)) * Math.pow(26, 3) +
                    getletval(name.charAt(2)) * Math.pow(26, 2) +  getletval(name.charAt(3)) * Math.pow(26, 1) +
                    getletval(name.charAt(4)) * Math.pow(26, 0) ;
        }
        return (int)namecode;
    }
    }




