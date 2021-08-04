public class AlfredTest{
    public static void main(String[] args){
        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane", "evening");
        String testDateAnnoucement = alfredBot.dateAnnouncement();
        String alexisTest = alfredBot.respondBeforeAlexis("ALexis! Play some lo-fi beats. ");
        String alfredTest = alfredBot.respondBeforeAlexis("I cant find my yo-yo. Maybe Alfred will know where it is");
        String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that is waht Batman is about");

        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnoucement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}