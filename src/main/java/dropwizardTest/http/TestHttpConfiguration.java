package dropwizardTest.http;

import io.dropwizard.Configuration;

import javax.validation.constraints.NotNull;

/**
 * TestHttp Configuration
 */
public class TestHttpConfiguration extends Configuration {

    @NotNull
    private String serverId;

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }
}
