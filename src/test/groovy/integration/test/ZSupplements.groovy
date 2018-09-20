package integration.test

import geb.spock.GebSpec
import integration.pages.ZSupplementsPage

class ZSupplements extends GebSpec{

    def 'access supplements'() {
        given:
        to ZSupplementsPage
        to ZSupplementsPage
        to ZSupplementsPage

        when: 'nothing'

        then:
        to ZSupplementsPage
    }
}
