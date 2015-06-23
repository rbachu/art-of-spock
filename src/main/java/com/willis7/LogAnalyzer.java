package com.willis7;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Sion Williams
 */
public class LogAnalyzer {

    public boolean IsValidLogFileName(String fileName) {
        if(StringUtils.isEmpty(fileName)) {
            throw new IllegalArgumentException("Filename has to be provided");
        }

        if(!StringUtils.endsWithIgnoreCase(fileName, ".SLF")) {
            return false;
        }
        return true;
    }
}
