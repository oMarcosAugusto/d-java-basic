import appExemple.FacebookMessenger;
import appExemple.MSNMessenger;

public class UserComputer {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        
        msn.sendMessage();

        FacebookMessenger fbM = new FacebookMessenger();
       
        fbM.sendMessage();
    }
    

}
