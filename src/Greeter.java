/**
 * Complete the TODO items below.
 *
 * ALSO answer the questions in the comments below.  (You may add your answers as further comments.)
 *
 */

import javax.swing.JOptionPane;

public class Greeter {

    // TODO: return the name entered by the user
    // QUESTION: Why can this method be marked as private?
    // ANSWER: The method can be marked private because its only used in the greeter class.
    private static void getNameFromGui() {
        String name = JOptionPane.showInputDialog("What is your name?");
    }

    // TODO: write a printName method that prints the messages "Hello, {name}!" to the console
    /**
     * Prints the message "Hello, {name}!" to the console
     * @param name the name of the person to greet
     */
    public static void printName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        // TODO: call the getNameFromGui method and store the result in a variable

        String name = JOptionPane.showInputDialog("What is your name?");

        // TODO: call the printName function with the variable you created above as an argument

        printName(name);
    }
}