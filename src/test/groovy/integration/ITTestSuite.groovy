package integration

import integration.test.ZOwners
import integration.test.ZSupplements
import integration.test.ZMain
import integration.test.ZOwnersList
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite.class)
@Suite.SuiteClasses([
        ZMain.class, ZSupplements.class, ZOwners.class, ZOwnersList.class
])

public class ITTestSuite {

}
