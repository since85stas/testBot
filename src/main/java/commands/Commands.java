package commands;

import messages.MessageMy;

import java.util.Map;
import java.util.TreeMap;

public class Commands {
    
    private Map<String, MessageMy> commands = new TreeMap<>();
    
    private Map<String, String> commandsDescr = new TreeMap<>();
    
    Commands() {
        addCommands();
    }
    
    private void addCommands() {
        commandsDescr.put("\\start", "Приветствие");
        commandsDescr.put("\\commands", "Узнать список команд");
        commandsDescr.put("\\мяу", "");
        commandsDescr.put("\\бяу", "");
        commandsDescr.put("\\беляу", "");
    }
    
    public void getCommandsDescrString() {
        StringBuilder builder = new StringBuilder();
        for (String c: commandsDescr.keySet()
             ) {
            builder.append(c).append(" - ").append(commandsDescr.get(c));
            builder.append("\n");
        }
    }
}
