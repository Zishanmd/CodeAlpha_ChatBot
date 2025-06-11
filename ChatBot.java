import java.util.*;
public class ChatBot{
    public static final Scanner sc=new Scanner(System.in);
    public static final Map<String, String> responses=new HashMap<>();
    public static void main(String[] args) {
        responsestrore();
        System.out.println("welcome i am CHAT BOT,what would you like to know:");
        while (true) { 
            String input=sc.nextLine().toLowerCase().trim();
            if (input.equals("bye")) {
                System.out.println("Goodbye! Have a great day.");
                return;
            }
            System.out.println(getresponse(input));
        }
        
    }
    private static void responsestrore(){
        responses.getOrDefault("hello", "Hello there! How can i help you?");
        responses.getOrDefault("hi", "Hi! What would you like you to know?");
        responses.getOrDefault("how are you", "i am just bot, but thanks for asking!");
        responses.getOrDefault("your name", "I am ChatBot, your assistant.");
        responses.getOrDefault("weather", "I can't predict the weather yet, but it looks great to code.");
        responses.getOrDefault("help", "I'm here to help. Ask me anything.");
        responses.getOrDefault("thanks", "You are welcome!");
    }
    private static String getresponse(String str){
        for (String key : responses.keySet()) {
            if (str.contains(key)) {
                return responses.get(key);
            }
        }
        return "sorry, I didn't understand that. Can you try asking differently?";
    }

}