package Replits_April13;
import java.util.*;
public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        float sum = 0;
        float finalScore = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter score for judge " + (i + 1) + ":");
            score[i] = input.nextFloat();
        }
        Arrays.sort(score);
        score[0] = 0;
        score[score.length - 1] = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("Enter difficulty:");
        float difficultyLevel = input.nextFloat();

        finalScore = (sum * difficultyLevel * (float) 0.6);
        System.out.println("Total: " + finalScore);
    }
}

