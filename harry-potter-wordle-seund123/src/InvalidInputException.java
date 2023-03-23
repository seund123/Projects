class InvalidInputException extends Exception{
 private String guess;

 public InvalidInputException(String guess){
     super(guess);
     this.guess = guess;


 }

    public String getGuess() {
        return guess;
    }
}