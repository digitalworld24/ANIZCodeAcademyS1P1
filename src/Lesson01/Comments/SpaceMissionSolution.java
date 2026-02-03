package Lesson01.Comments;

public class SpaceMissionSolution {

        // The main method is the starting point of every Java program
        public static void main(String[] args) {

            // Create an object of the SpaceMission class
            // This allows us to use the methods in this class
            SpaceMissionSolution mission = new SpaceMissionSolution();

            // Call a method that prints the title
            mission.printTitle();

            // Call a method that prints information about the astronaut
            mission.printAstronautInfo();
        }

        // This method prints a title for the program
        // It does not return anything, so the return type is void
        public void printTitle() {

            // Print a line of "=" characters
            System.out.println("================================");

            // Print the title text
            System.out.println("  Andreas Mogensen's Space Trip ");

            // Print another line of "=" characters
            System.out.println("================================");

            // Print an empty line using an escape character (\n)
            System.out.println("\n");
        }


        // This method prints information about the astronaut and the mission
        public void printAstronautInfo() {

            // Declare and initialize variables
            // Variables with astronaut information
            // These variables store information as text (String)
            String name = "Andreas Mogensen";
            String nationality = "Danish";
            String mission = "International Space Station (ISS)";

            // Print the astronaut's name
            System.out.println("Astronaut name: " + name);

            // Print the nationality
            System.out.println("Nationality: " + nationality);

            // Print the mission
            // The quotation marks are printed using escape characters (\")
            System.out.println("Mission: \"" + mission + "\"");

            // Print an empty line to make the output easier to read
            System.out.println("\n");

            // Print a message header
            System.out.println("Message from space:");

            // Print a message using quotation marks and text
            System.out.println("\"Hello Earth! I am coding from space!\"");
        }
    }



