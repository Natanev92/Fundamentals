import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting(){
        return "Hello, Lovely to see you. How are you?";
    }
    public String guestGreeting(String name, String dayPeriod){
        return String.format("Good %s, %s", dayPeriod, name);
    }
    public String dateAnnouncement(){
        Date date = new Date();
        return "Todays dste is" + date;
    }
    public String respondBeforeAlexis(String conversation){
        int findAlexis = conversation.indexOf("ALexis");
        int findAlfred = conversation.indexOf("Alfred");
        if (findAlexis != -1) {
            return "Right away sir. she certainly isnt sophisticated for something like that ";
        }
        else if (findAlfred != -1){
            return "AT your service.";
        }
        else {
            return "Right. and with that, I shall retire";
        }
    }
}