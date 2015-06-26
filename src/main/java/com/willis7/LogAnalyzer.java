package com.willis7;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Sion Williams
 */
public class LogAnalyzer {;
    private IExtensionManager manager;

    public LogAnalyzer(IExtensionManager mgr) {
        this.manager = mgr;
    }

    public boolean IsValidLogFileName(String fileName) {
        return manager.isValid(fileName);
    }
}
