package com.willis7;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Sion Williams
 */
public class LogAnalyzer {

    public boolean IsValidLogFileName(String fileName) {
        if(!StringUtils.endsWithIgnoreCase(fileName, ".SLF")) {
            return false;
        }
        return true;
    }
}
