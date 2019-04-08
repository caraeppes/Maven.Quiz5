package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {

    private String input;
    private PalindromeEvaluator palindromeEvaluator;

    public PalindromeObject(String input) {
        this.input = input;
        this.palindromeEvaluator = new PalindromeEvaluator();
    }

    public String[] getAllPalindromes(){
        return palindromeEvaluator.getAllPalindromes(input);
    }

    public Boolean isPalindrome(){
        return palindromeEvaluator.isPalindrome(input);
    }

    public String reverseString(){
        return palindromeEvaluator.reverseString(input);
    }
}
