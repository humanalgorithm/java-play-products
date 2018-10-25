import play.jobs.*;
import play.test.*;

import models.*;

@OnApplicationStart
public class Bootstrap extends Job {

    @Override
    public void doJob() {
        if (Product.count() == 0) {
            System.out.println("About to load default data...");
            Fixtures.loadModels("initial-data.yml");
//            Address address = Address.all().first();
//            OrderItem orderItem = new OrderItem("abc-123-striped", address);
//            orderItem.save();
        }
    }

}