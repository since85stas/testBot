import commands.Commands;
import messages.MessageMy;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import java.io.File;

public class MyAmazingBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {

            processCommand(update);

        }
    }

    private void processCommand(Update update) {
        Commands commands = Commands.getInstance();

        MessageMy mess = commands.checkCommand(update.getMessage().getText());
        if (mess != null) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(mess.getMessageText());
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

            File phFile = mess.getPhotoFile();
            if (phFile != null) {
                SendPhoto sendPhoto = new SendPhoto();
                sendPhoto.setChatId(update.getMessage().getChatId().toString());

                InputFile inputFile = new InputFile(phFile);
                sendPhoto.setPhoto(inputFile);

                try {
                    execute(sendPhoto); // Call method to send the message
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }

        } else {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText("К сожалению такого я еще не умею");
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "Beliash1_bot";
    }

    @Override
    public String getBotToken() {
        return "5204596368:AAH99ayR0vZn-gxUMvyzcctaNbw41k_C-zo";
    }

}
