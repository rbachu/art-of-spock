package com.willis7;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Sion Williams
 */
public class LogAnalyzer {
    boolean wasLastFileNameValid;

    public boolean isWasLastFileNameValid() {
        return wasLastFileNameValid;
    }

    public void setWasLastFileNameValid(boolean wasLastFileNameValid) {
        this.wasLastFileNameValid = wasLastFileNameValid;
    }

    public boolean IsValidLogFileName(String fileName) {
        // Changes the state of the system
        wasLastFileNameValid = false;

        if(StringUtils.isEmpty(fileName)) {
            throw new IllegalArgumentException("Filename has to be provided");
        }

        if(!StringUtils.endsWithIgnoreCase(fileName, ".SLF")) {
            return false;
        }
        wasLastFileNameValid = true;
        return true;
    }
}
