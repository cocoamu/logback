package com.example.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(TestLog.class);

        if (logger.isDebugEnabled()){
            logger.debug("this is debug log");
        }
        if (logger.isInfoEnabled()){
            logger.info("this is info log");
        }

    }
}
