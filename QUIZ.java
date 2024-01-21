import java.util.Scanner;

	public class QuizApplication {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Define questions and answers
	        String[] questions = {
	            "What is the capital of France?",
	            "Which planet is known as the Red Planet?",
	            "What is the largest mammal on Earth?"
	        };

	        String[] options = {
	            "A. Paris\tB. Berlin\tC. Rome",
	            "A. Venus\tB. Mars\tC. Jupiter",
	            "A. Elephant\tB. Blue Whale\tC. Giraffe"
	        };

	        char[] correctAnswers = {'A', 'B', 'B'};

	        // Quiz loop
	        int score = 0;
	        for (int i = 0; i < questions.length; i++) {
	            System.out.println(questions[i]);
	            System.out.println(options[i]);

	            System.out.print("Your answer: ");
	            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

	            // Check user's answer
	            if (userAnswer == correctAnswers[i]) {
	                System.out.println("Correct!\n");
	                score++;
	            } else {
	                System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + ".\n");
	            }
	        }

	        // Display final score
	        System.out.println("Quiz completed! Your final score is: " + score + "/" + questions.length);

	        // Close the scanner
	        scanner.close();
	    }
	}

