package MProjects;
import java.util.Scanner;

public class QuizGame {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    String[] questions = {
            "What is the capital of France?",
            "Which keyword is used to create an object in Java?",
            "Which data type is used to store true/false?",
            "Who developed Java?",
            "What is 5 * 6?"
    };
    String[][] options = {
            {"A. Berlin", "B. Madrid", "C. Paris", "D. Rome"},
            {"A. class", "B. new", "C. this", "D. create"},
            {"A. int", "B. boolean", "C. char", "D. double"},
            {"A. Google", "B. Microsoft", "C. Sun Microsystems", "D. Apple"},
            {"A. 11", "B. 25", "C. 30", "D. 60"}
    };
    char[] answers = {'C', 'B', 'B', 'C', 'C'};
    int score = 0;

    System.out.println("=== Welcome to the Quiz Game ===");
    for (int i = 0; i < questions.length; i++) {
        System.out.println("\nQ" + (i + 1) + ": " + questions[i]);

        for (String option : options[i]) {
            System.out.println(option);
        }

        System.out.print("Your answer (A/B/C/D): ");
        char userAnswer = scan.next().toUpperCase().charAt(0);

        if (userAnswer == answers[i]) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! Correct answer: " + answers[i]);
        }
    }

    System.out.println("\nQuiz Finished!");
    System.out.println("Your score: " + score + "/" + questions.length);

    scan.close();

}
}
