package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CustomLogger {

    private static final Logger logger = LogManager.getLogger(CustomLogger.class);

    public static void main(String[] args) throws IOException {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("testLoggerTT.txt"));
            bufferedWriter.write("this is tst");
        } catch (IOException error) {
            logger.error("failed shod kee", error);
        } finally {
            bufferedWriter.close();
        }
    }
}
