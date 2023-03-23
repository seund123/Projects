public class index {
    indexNode[] letterIndex;

    class indexNode {
            char letter;
            node firstOne;

        }
        public node findSpot(String name) {
        char letter = name.charAt(0);
        int index = letter - (int) 'a';
        node current = letterIndex[index].firstOne;
        node prev = current;
        while (current != null && !current.name.equals(name)) {
            prev = current;
            current = current.next;
        }
        return prev;
    }

    public void arrindex() {

        letterIndex = new indexNode[26];
        for (int j = 0; j < 26; j++) {
            letterIndex[j] = new indexNode();
            letterIndex[j].letter = (char) ('a' + j);
            letterIndex[j].firstOne = null;
        }
    }
    public void addToIndex(String name) {
        char firstLetter = name.charAt(0);
        int index = firstLetter - (int) 'a';
        node newNode = new node();
        newNode.name = name;
        if (letterIndex[index].firstOne == null) {
            letterIndex[index].firstOne = newNode;
        } else {
            node prevNode = findSpot(name);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }
    public void printNames(char letter) {
        int index = (int)letter - (int)'a';
        node current = letterIndex[index].firstOne;
        while (current != null) {
            if (current.name.charAt(0) == letter) {
                System.out.println(current.name);
            }
            current = current.next;
        }
    }
    public void Length(char startLetter) {
        int index = (int)startLetter - (int)'a';
        node current = letterIndex[index].firstOne;
        int count = 0;
        while (current != null) {
            ++count;
            current = current.next;
        }

        System.out.println( count);
    }
}
