package _07_05;

import java.nio.file.*;
import java.io.IOException;

public class FilesExercise {

    public static void main(String[] args) {
        Path folderAPath = Paths.get("folderA");
        Path folderBPath = Paths.get("folderB");

        // Create a new empty file called example.txt inside folderA
        Path fileAPath = folderAPath.resolve("example.txt");
        try {
            if (!Files.exists(folderAPath)) {
                Files.createDirectories(folderAPath);
            }
            Files.createFile(fileAPath);
            System.out.println("File created in folderA: " + fileAPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Copy the file to folderB
        Path fileBPath = folderBPath.resolve(fileAPath.getFileName());
        try {
            if (!Files.exists(folderBPath)) {
                Files.createDirectories(folderBPath);
            }
            Files.copy(fileAPath, fileBPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied to folderB: " + fileBPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // List the contents of folderB to check that your file is in there
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(folderBPath)) {
            System.out.println("Contents of folderB:");
            for (Path path : stream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            e.printStackTrace();
        }
    }
}
