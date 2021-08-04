public class FizzBuzz {
    public String fizzBuzz(int number,String multOf3word, String multOf5word, String multOf15word){
        if ((number%3)== 0 && (number%5)==0){
            return String.format("%s", multOf15word);
        }
        else if ((number%3)== 0){
            return String.format("%s", multOf3word);
        }
        else if ((number%5)== 0){
            return String.format("%s", multOf5word);
        }
        else{
            return String.valueOf(number);
        }
    }
}
