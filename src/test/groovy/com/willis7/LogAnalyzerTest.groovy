package com.willis7

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author Sion Williams
 */
class LogAnalyzerTest extends Specification {

    @Unroll
    def "IsValidLogFileName when called with #filename returns #expected"() {
        given:
        LogAnalyzer analyzer = MakeAnalyser()

        expect:
        analyzer.IsValidLogFileName(filename) == expected

        where:
        filename                    | expected
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

    @Unroll
    def "IsValidLogFileName when called with #filename changes wasLastFileNameValid to #expected"() {
        given:
        LogAnalyzer analyzer = MakeAnalyser()
        analyzer.IsValidLogFileName(filename)

        expect:
        analyzer.wasLastFileNameValid == expected

        where:
        filename       | expected
        "goodfile.slf" | true
        "badfile.foo"  | false
    }

    /**
     * Factory method creates instances of LogAnalyzer
     * @return LogAnalyzer
     */
    private LogAnalyzer MakeAnalyser() {
        new LogAnalyzer()
    }
}
