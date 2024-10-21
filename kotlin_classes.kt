// Enum class to represent difficulty levels for the questions
enum class Difficulty {
    EASY, MEDIUM, HARD
}

// Interface to define a progress report behavior
interface ProgressReport {
    // A property to show the progress in text form
    val progressText: String

    // A function to display the progress bar
    fun progressBar()
}

// A generic data class for the questions in the quiz
data class Question<T>(
    val questionText: String,  // Text of the question
    val answer: T,             // Generic type for the answer
    val Level: Difficulty      // Difficulty level of the question
)

// Main Quiz class which implements ProgressReport
class Quiz: ProgressReport {
    // Instances of Question class with specific types (String and Int)
    val a = Question<String>("Quoth the raven ___", "nevermore", Difficulty.EASY)
    val b = Question<String>("Quoth the raven ___", "nevermore", Difficulty.EASY)
    val c = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    // Companion object to track student progress (total questions and solved questions)
    companion object StudentProgress {
        val total = 10    // Total number of questions in the quiz
        val solved = 3    // Number of questions solved by the student
    }

    // Implementing the progressText property from ProgressReport
    override val progressText: String
        get() = "Out of $total questions, you solved $solved"

    // Implementing the progressBar function from ProgressReport
    override fun progressBar() {
        // Displaying progress with solved (▓) and unsolved (▒) questions
        repeat(Quiz.solved) { print("▓") }  // Print solved questions as filled blocks
        repeat(Quiz.total - Quiz.solved) { print("▒") }  // Print remaining as empty blocks
        println()  // Move to the next line after the progress bar
        print(progressText)  // Display the progressText
    }

    // Function to print each question and its details (difficulty, answer, and question text)
    fun printQuiz() {
        // Using 'let' to apply operations on each question
        a.let {
            println(it.Level)           // Print difficulty level
            println(it.answer)          // Print the answer
            println(it.questionText)    // Print the question text
        }

        b.let {
            println(it.Level)
            println(it.answer)
            println(it.questionText)
        }

        c.let {
            println(it.Level)
            println(it.answer)
            println(it.questionText)
        }
    }
}

// Main function to run the program
fun main() {
    // Create a Quiz object
    val quiz = Quiz()

    // Print the questions using the quiz object
    quiz.printQuiz()

    // Using 'apply()' to call the same printQuiz() method without storing the Quiz object
    Quiz().apply {
        printQuiz()  // Directly call printQuiz() inside the apply block
    }
}
