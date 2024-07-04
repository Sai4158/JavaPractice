package aa_prac1;

public class Combine implements Phone {

    @Override
    public void sim(int sim) {
        // TODO Auto-generated method stub
        System.out.println("This phone has " + sim + " SIMs.");
        // Example of adding more functionality:
        if (sim > 1) {
            System.out.println("Dual SIM feature enabled.");
        } else {
            System.out.println("Single SIM feature.");
        }
    }

    @Override
    public void speaker() {
        // TODO Auto-generated method stub
        int speakerVolume = 10; // Example of a variable for speaker volume
        System.out.println("Speaker volume is set to " + speakerVolume);
        // Example of adding more functionality:
        if (speakerVolume > 5) {
            System.out.println("Speaker is loud.");
        } else {
            System.out.println("Speaker is at a moderate volume.");
        }
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        String displayType = "AMOLED"; // Example of a variable for display type
        System.out.println("This phone has an " + displayType + " display.");
        // Example of adding more functionality:
        if (displayType.equals("AMOLED")) {
            System.out.println("The display quality is excellent.");
        } else {
            System.out.println("The display is standard.");
        }
    }

    @Override
    public void camera() {
        // TODO Auto-generated method stub
        int cameraResolution = 108; // Example of a variable for camera resolution in MP
        System.out.println("This phone has a " + cameraResolution + "MP camera.");
        // Example of adding more functionality:
        if (cameraResolution > 50) {
            System.out.println("The camera quality is high.");
        } else {
            System.out.println("The camera quality is average.");
        }
    }

    @Override
    public void flashLight(boolean flash) {
        // TODO Auto-generated method stub
        if (flash) {
            System.out.println("This phone has flash.");
            // Example of adding more functionality:
            System.out.println("Flashlight is turned on.");
        } else {
            System.out.println("This phone has no flash.");
            // Example of adding more functionality:
            System.out.println("Flashlight is turned off.");
        }
    }
}
