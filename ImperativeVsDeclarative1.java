// find sum of first 100 integers(1-100)
import java.util.stream.IntStream;

class ImperativeVsDeclarative1{

    public static void main(String[] args){

        /*
         * Imperative Style
        */
        int sum = 0;
        for (int i = 1; i <= 100; i++) sum += i;
        System.out.println("Imperative Programming sum: " + sum);

        /*
         * Declarative Style
        */
        int sum1 = IntStream.rangeClosed(0,100).sum();
        System.out.println("Declarative Programming sum: " + sum1);
    }
}