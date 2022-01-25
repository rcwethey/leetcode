/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 *
 * time complexity: O(log n)
 * time: 0ms
 * space complexity: n
 * space: 35.8 mb
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(guess(1) != 0) return helper(1, n);
        return 1;
    }
    
    public int helper(int lower, int upper){
        int half = upper - (int)Math.floor((upper-lower)/2);
        int halfGuess = guess(half);
        
        if(halfGuess == -1) return helper(1, half);
        if(halfGuess == 1) return helper(half, upper);
        return half;
    }
}