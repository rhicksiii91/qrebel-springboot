package integration.pages

import geb.Page

class ZOwnersListPage extends Page {
    static url = 'http://localhost:7000/owners?lastName='
    static at = { title == "PetClinic :: a Spring Framework demonstration" }
    static content = {

    }
}
