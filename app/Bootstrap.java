import play.jobs.*;
import play.test.*;

import models.*;

@OnApplicationStart
public class Bootstrap extends Job {

    @Override
    public void doJob() {
        if (UserAccount.count() == 0) {
            System.out.println("About to load default data...");
            Fixtures.loadModels("initial-data.yml");
        }
    }

}