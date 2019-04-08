package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 18/12/2018.
 */
import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

public class PalindromeObject {

    private String input;

    public PalindromeObject(String input) {
        this.input = input;
    }

    public String[] getAllPalindromes(){
        return PalindromeEvaluator.getAllPalindromes(input);
    }

    public Boolean isPalindrome(){
        return PalindromeEvaluator.isPalindrome(input);
    }

    public String reverseString(){
        return PalindromeEvaluator.reverseString(input);
    }
}
