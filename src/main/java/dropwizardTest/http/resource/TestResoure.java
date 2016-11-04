
package dropwizardTest.http.resource;

import com.google.common.base.Optional;
import dropwizardTest.http.entity.ResultEntity;
import dropwizardTest.http.entity.tickets.Tickets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * Tickets related resource
 */
@Path("/tickets")
@Produces(MediaType.APPLICATION_JSON)
public class TestResoure {

    // Logger
    private static final Logger logger = LoggerFactory.getLogger(TestResoure.class);

    public TestResoure() {

    }

    @GET
    public ResultEntity gettickets(@HeaderParam("Accept-Language") @DefaultValue("zh") String lang,
                                   @QueryParam("username") Optional<String> username) {
        logger.debug("进入GET: tickets");
        Map<String, String> r = new HashMap<>();
        if (username.isPresent())
            r.put("username", username.get());
        else
            r.put("username", "不存在");
        return new ResultEntity<>(r);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultEntity posttickets(@HeaderParam("Accept-Language") @DefaultValue("zh") String lang,
                                    @Valid Tickets tickets) {
        logger.debug("Process signIn request: {}", tickets);
        // TODO: validate name password mobile email format
        String username = tickets.getUsername();
        Map<String, Object> r = new HashMap<>();
        r.put("username", username);
        return new ResultEntity<>(r);
    }

}
