package messages;

import java.io.File;
import java.util.List;
import java.util.Random;

public class MiauMessage extends MessageMy {

    public MiauMessage() {
        super();
    }

    @Override
    public String getMessageText() {
        return "мяу мяу";
    }

    @Override
    public File getPhotoFile() {
        File[] files = getPhotosList();
        Random random = new Random();
        int v = random.nextInt(files.length);
        return files[v];
    }

    private File[] getPhotosList() {
        File f = new File("/photo"); // current directory

        File[] files = f.listFiles();
        return files;
    }
}
