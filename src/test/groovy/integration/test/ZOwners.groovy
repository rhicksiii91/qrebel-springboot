package integration.test

import geb.spock.GebSpec
import integration.pages.ZOwnersPage

class ZOwners extends GebSpec{

    def 'access owners'() {
        given:
        to ZOwnersPage
        to ZOwnersPage
        to ZOwnersPage

        when: 'nothing'

        then:
        at ZOwnersPage
        heading == "Owners"
    }
}
