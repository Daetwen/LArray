package edu.epam.array.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LArrayFileReader {

    private static Logger logger = LogManager.getLogger();

    public List<String> readArray(String filePath) {
        List<String> infoList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader (new FileReader(filePath))) {
            Path path = Paths.get(filePath);
            if(Files.notExists(path)) {
                logger.error("File doesn't exist");
                throw new FileNotFoundException("File doesn't exist");
            }
            String data;
            while ((data = reader.readLine()) != null) {
                infoList.add(data);
            }
            logger.info("Information read successfully");
            return infoList;
        } catch (IOException e) {
            logger.error("Error reading from file");
        }
        return infoList;
    }
}
