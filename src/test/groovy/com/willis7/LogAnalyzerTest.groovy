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

    def "IsValidLogFileName good extension lowercase returns true"() {
        given:
        LogAnalyzer analyzer = new LogAnalyzer()

        when:
        boolean result = analyzer.IsValidLogFileName("filewithbadextension.slf")

        then:
        result == true
    }

    def "IsValidLogFileName good extension uppercase returns true"() {
        given:
        LogAnalyzer analyzer = new LogAnalyzer()

        when:
        boolean result = analyzer.IsValidLogFileName("filewithbadextension.SLF")

        then:
        result == true
    }
}
