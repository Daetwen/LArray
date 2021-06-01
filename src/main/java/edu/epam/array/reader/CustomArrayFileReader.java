package edu.epam.array.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomArrayFileReader {

    private static Logger logger = LogManager.getLogger();

    public List<String> readArray(String filePath) {
        List<String> infoList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader (new FileReader(filePath))) {
            String data;
            while ((data = reader.readLine()) != null) {
                infoList.add(data);
            }
            logger.info("Information read successfully.");
            return infoList;
        } catch (IOException e) {
            logger.error("Error reading from file.");
            e.getMessage();
        }
        return infoList;
    }
}
