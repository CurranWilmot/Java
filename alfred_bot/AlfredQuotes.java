import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello, " + name + ". Lovely to see you.";
    }

    public String guestGreeting(String name, String dayPeriod) {
        switch(dayPeriod){
            case "morning":
                return "Good morning, " + name + ". Lovely to see you.";
            case "afternoon":
                return "Good afternoon, " + name + ". Lovely to see you.";
            case "evening":
                return "Good evening, " + name + ". Lovely to see you.";
            default: 
                return "Hello, " + name + ". Lovely to see you.";
        }
    }
    

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
            if(conversation.indexOf("Alexis") != -1){
                return "Right away, sir. She certainly isn't sophisticated enough for that.";
            }
            else if(conversation.indexOf("Alfred") != -1){
                return "At your service. As you wish, naturally.";
            }
            else{
                return "Right. And with that I shall retire";
                }
        }

    // public String respondBeforeAlexis(String conversation) {
    //     String personName = conversation.indexOf("Alexis") + " " conversation.indexOf("Alfred");
    //     switch(conversation.indexOf()){
    //         case conversation.indexOf("Alexis") != -1:
    //             return "Right away, sir. She certainly isn't sophisticated enough for that.";
    //             break;
    //         case conversation.indexOf("Alfred") != -1:
    //             return "At your service. As you wish, naturally.";
    //             break;
    //         default:
    //             return "Right. And with that I shall retire";
    //     }
    // }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

