package commands;

import messages.MessageMy;
import messages.StartMessage;

import java.util.Map;
import java.util.TreeMap;

public class Commands {

    private static Commands instance;
    
    private Map<String, MessageMy> commands = new TreeMap<String, MessageMy>();
    
    private Map<String, String> commandsDescr = new TreeMap<String, String>();

    public static Commands getInstance() {
        if (instance == null) {
            instance = new Commands();
            return instance;
        } else {
            return instance;
        }
    }

    private Commands() {
        addCommandsDescr();
        addCommands();
    }
    
    private void addCommandsDescr() {
        commandsDescr.put("\\start", "Приветствие");
        commandsDescr.put("\\commands", "Узнать список команд");
        commandsDescr.put("\\мяу", "");
        commandsDescr.put("\\бяу", "");
        commandsDescr.put("\\беляу", "");
    }

    private void addCommands() {
        for (String descr: commandsDescr.keySet()
             ) {
            if (descr.equals("\\start")) {
                commands.put(descr, new StartMessage());
            } else if (descr.equals("\\commands")) {
                commands.put(descr, new StartMessage());
            } else if (descr.equals("\\мяу")) {

            }
        }
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
