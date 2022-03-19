package messages;

public class StartMessage extends MessageMy{


    @Override
    public String getMessageText() {
        StringBuilder builder = new StringBuilder();
        builder.append("Привет, я компьютерный кот Беляш!");
        builder.append("\n");
        builder.append("Если хочешь поговорить, я всегда готов, вот какие команды я знаю:");

        return null;
    }
}
