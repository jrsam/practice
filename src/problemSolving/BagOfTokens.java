package problemSolving;

import java.util.Arrays;
/*
You have an initial power of power, an initial score of 0, and a bag of tokens where tokens[i] is the value of the ith token (0-indexed).

Your goal is to maximize your total score by potentially playing each token in one of two ways:

If your current power is at least tokens[i], you may play the ith token face up, losing tokens[i] power and gaining 1 score.
If your current score is at least 1, you may play the ith token face down, gaining tokens[i] power and losing 1 score.
Each token may be played at most once and in any order. You do not have to play all the tokens.

Return the largest possible score you can achieve after playing any number of tokens.
 */
public class BagOfTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        int first = 0;
        int last = tokens.length - 1;
        Arrays.sort(tokens);
        int score = 0;
        int max = 0;
        while (first <= last) {
            if (tokens[first] <= power) {
                power -= tokens[first];
                score += 1;
                if (score > max) {
                    max = score;
                }
                first++;
            } else if (score >= 1) {
                power += tokens[last];
                score -= 1;
                last--;
            } else break;
        }

        return max;

    }
}
