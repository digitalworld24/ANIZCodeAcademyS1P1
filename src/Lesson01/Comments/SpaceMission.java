package Lesson01.Comments;

public class SpaceMission {

    public static void main(String[] args) {

        SpaceMission mission = new SpaceMission();


        mission.printTitle();
        mission.printAstronautInfo();
    }



    public void printTitle() {
        System.out.println("================================");
        System.out.println("  Andreas Mogensen's Space Trip ");
        System.out.println("================================\n");
    }


    public void printAstronautInfo() {

        String name = "Andreas Mogensen";
        String nationality = "Danish";
        String mission = "International Space Station (ISS)";


        System.out.println("Astronaut name: " + name);
        System.out.println("Nationality: " + nationality);
        System.out.println("Mission: \"" + mission + "\"");
        System.out.println("\nMessage from space:");
        System.out.println("\"Hello Earth! I am coding from space!\"");
    }
}

