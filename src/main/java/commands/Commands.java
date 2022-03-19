package commands;

import messages.MessageMy;

import java.util.Map;
import java.util.TreeMap;

public class Commands {

    private static Commands instance;
    
    private Map<String, MessageMy> commands = new TreeMap<>();
    
    private Map<String, String> commandsDescr = new TreeMap<>();

    public static Commands getInstance() {
        if (instance == null) {
            instance = new Commands();
            return instance;
        } else {
            return instance;
        }
    }

    private Commands() {
        addCommands();
    }
    
    private void addCommands() {
        commandsDescr.put("\\start", "Приветствие");
        commandsDescr.put("\\commands", "Узнать список команд");
        commandsDescr.put("\\мяу", "");
        commandsDescr.put("\\бяу", "");
        commandsDescr.put("\\беляу", "");
    }
    
    public String  getCommandsDescrString() {
        StringBuilder builder = new StringBuilder();
        for (String c: commandsDescr.keySet()
             ) {
            builder.append(c).append(" - ").append(commandsDescr.get(c));
            builder.append("\n");
        }
        return builder.toString();
    }


}
