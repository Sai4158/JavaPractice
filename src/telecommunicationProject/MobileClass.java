package telecommunicationProject;

public class MobileClass {

    // variables 
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    // constructor
    public MobileClass(String myNumber) {
        this.myNumber = myNumber;
    }

    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone Powered On");
    }

    public void dial(String phoneNumber) {
        if(isPowerOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.err.println("Phone is not powered on");
        }
    }

    public void answer() {
        if(isRinging) {
            System.out.println("Answering the phone");
            isRinging = false;
        } else {
            System.err.println("Phone is not ringing");
        }
    }

    public boolean callPhone(String phoneNumber) {
        if(phoneNumber.equals(myNumber) && isPowerOn) {
            isRinging = true;
            System.out.println("Phone is ringing");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    public boolean isRinging() {
        return isRinging;
    }
}
