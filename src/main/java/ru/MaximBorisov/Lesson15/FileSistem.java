package ru.MaximBorisov.Lesson15;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileSistem {
    public static void main(String[] args) {
        FileSistem fileSistem = new FileSistem();
        File currentClass = null;
        try {
            currentClass = new File(URLDecoder.decode(FileSistem.class
                    .getProtectionDomain()
                    .getCodeSource()
                    .getLocation()
                    .getPath(), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String classDirectory = currentClass.getParent();

        File fileOne = fileSistem.createFile(classDirectory, "test.txt");
        File fileTwo = fileSistem.renameFile(fileOne, "test2.txt");
        File fileThree = fileSistem.copyFile(fileTwo);
        fileSistem.deleteFile(fileTwo);
        fileSistem.deleteFile(fileThree);
    }

    private File createFile(String track, String name) {
        File result = null;
        try {
            String trackFile = track + File.separator + name;
            Path path = Paths.get(trackFile);
            result = new File(trackFile);
            Files.createFile(path);
            System.out.println("создан файл" + trackFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private File renameFile(File file, String newName) {

        String fileTrack = file.getParent() + File.separator + newName;
  //      System.out.println(fileTrack);
        File newFile = new File(fileTrack);
        if (file.renameTo(newFile)) {
            System.out.println(file.getName() + " переименован в " + newFile.getName());
            return newFile;
        } else
            return file;
    }
    private File copyFile(File file) {
         String fileTrackNew = file.getParent() + File.separator + "copy" + file.getName();
        File newFile = new File(fileTrackNew);
        try {
            Files.copy(file.toPath(), newFile.toPath());
            System.out.println(file.getName() + " скопирован файл в " + newFile.getName());
            return newFile;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    private void deleteFile(File file) {
        try {
            Files.delete(file.toPath());
            System.out.println(file.getName() + " удален");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
