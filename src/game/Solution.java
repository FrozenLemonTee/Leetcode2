package game;

public class Solution {
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) count += 1;
        }
        return count;
    }
}
