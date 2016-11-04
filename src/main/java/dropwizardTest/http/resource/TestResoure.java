package dropwizardTest.http.resource;

import io.dropwizard.jersey.PATCH;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.security.PermitAll;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * TestResoure
 */
@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class TestResoure {
    // Logger
    private static final Logger logger = LoggerFactory.getLogger(TestResoure.class);

    @Path("/{helloword}")
    @PermitAll
    @PATCH
    public String Helloword(@PathParam("helloword") String productId) {
        logger.debug("start");
        return "Helloword!";
    }
}
