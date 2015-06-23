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
        LogAnalyzer analyzer = new LogAnalyzer()

        expect:
        analyzer.IsValidLogFileName(value) == expected

        where:
        value                       | expected
        "fileWithGoodExtension.SLF" | true
        "fileWithGoodExtension.slf" | true
        "fileWithBadExtension.foo"  | false
    }
}
