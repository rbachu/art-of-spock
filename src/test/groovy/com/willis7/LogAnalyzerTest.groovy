package com.willis7

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author Sion Williams
 */
class LogAnalyzerTest extends Specification {
    def "IsValidLogFileName name supported extension returns true"() {
        given: "a stub setup to return true"
        FakeExtensionManager fakeExtensionManager = new FakeExtensionManager();
        fakeExtensionManager.willBeValid = true;

        when: "we send in the stub"
        LogAnalyzer logAnalyzer = new LogAnalyzer(fakeExtensionManager);

        then: "the test asserts true"
        logAnalyzer.IsValidLogFileName("short.ext")
    }

}

class FakeExtensionManager implements IExtensionManager {
    public boolean willBeValid = false;
    
    @Override
    boolean isValid(String fileName) {
        return willBeValid;
    }
}
