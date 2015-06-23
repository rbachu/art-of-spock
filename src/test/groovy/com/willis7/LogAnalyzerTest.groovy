package com.willis7

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author Sion Williams
 */
class LogAnalyzerTest extends Specification {

    @Unroll
    def "IsValidLogFileName input #value returns #expected"() {
        given:
        LogAnalyzer analyzer = MakeAnalyser()

        expect:
        analyzer.IsValidLogFileName(value) == expected

        where:
        value                       | expected
        "fileWithGoodExtension.SLF" | true
        "fileWithGoodExtension.slf" | true
        "fileWithBadExtension.foo"  | false
    }

    def "IsValidLogFileName empty filename throws exception"() {
        given:
        LogAnalyzer analyzer = MakeAnalyser()

        when:
        analyzer.IsValidLogFileName(null)

        then:
        def exception = thrown(IllegalArgumentException)
        exception.message == "Filename has to be provided"
    }

    /**
     * Factory method creates instances of LogAnalyzer
     * @return LogAnalyzer
     */
    private LogAnalyzer MakeAnalyser() {
        new LogAnalyzer()
    }
}
