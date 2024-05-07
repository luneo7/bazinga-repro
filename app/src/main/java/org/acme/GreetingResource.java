package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.bazinga.extension.Bazinga;

@Path("/hello")
public class GreetingResource {
    @Inject
    Bazinga bazinga;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return bazinga.callSheldon();
    }
}
