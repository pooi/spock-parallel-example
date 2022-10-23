package org.example

import spock.lang.Specification

class Test02Spec extends Specification {

    def "test 1"() {
        given:
        def a = 3

        when:
        def b = a * 3
        sleep(3000)

        then:
        b == 9
        0 * _
    }

    def "test 2"() {
        given:
        def a = 3

        when:
        def b = a * 3
        sleep(3000)

        then:
        b == 9
        0 * _
    }
}
