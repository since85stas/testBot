package messages;

import commands.Commands;

public class StartMessage extends MessageMy{

    public StartMessage() {
        super();
    }

    @Override
    public String getMessageText() {
        StringBuilder builder = new StringBuilder();
        builder.append("Привет, я компьютерный кот Беляш!");
        builder.append("\n");
        builder.append("Если хочешь поговорить, я всегда готов, вот какие команды я знаю:");
        builder.append("\n");
        builder.append("");

        Commands commands = Commands.getInstance();
        builder.append(commands.getCommandsDescrString());
        return builder.toString();
    }
}
