package messages;

public class Messages {

    public Messages() {}

    public String getStartMessage() {
        StartMessage message = new StartMessage();
        return message.getMessageText();
    }


}
