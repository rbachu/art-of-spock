package com.willis7;

/**
 * @author Sion Williams
 */
public class LogAnalyzer {

    public boolean IsValidLogFileName(String fileName) {
        if(!fileName.endsWith(".SLF")) {
            return false;
        }
        return true;
    }
}
