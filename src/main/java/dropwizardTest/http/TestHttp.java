package dropwizardTest.http;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xiaopeng on 2016/10/14.
 */
public class TestHttp extends Application<TestHttpConfiguration> {
    private static final Logger logger = LoggerFactory.getLogger(TestHttp.class);

    public static void main(String[] args) throws Exception {
        new TestHttp().run(args);
    }

    @Override
    public void run(TestHttpConfiguration configuration, Environment environment) throws Exception {
        // storage & message queue
    }

}
