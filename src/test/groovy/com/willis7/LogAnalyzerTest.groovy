package com.willis7

import spock.lang.Specification

/**
 * @author Sion Williams
 */
class LogAnalyzerTest extends Specification {
    def "IsValidLogFileName bad extension returns false"() {
        given:
        LogAnalyzer analyzer = new LogAnalyzer()

        when:
        boolean result = analyzer.IsValidLogFileName("filewithbadextension.foo")

        then:
        result == false
    }
}
