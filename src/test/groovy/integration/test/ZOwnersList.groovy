package integration.test

import geb.spock.GebSpec
import integration.pages.ZOwnersListPage

class ZOwnersList extends GebSpec{

    def 'access OwnersList'() {
        given:
        to ZOwnersListPage

        when: 'nothing'

        then:
        to ZOwnersListPage
    }
}
