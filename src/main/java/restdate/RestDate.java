package restdate;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Path("")
public class RestDate {
    @GET
    @Path("date")
    @Produces("application/json")
    public Response date(
            @QueryParam("dateFormat") @DefaultValue("")
            String dateFormat) {
        ZonedDateTime dt = ZonedDateTime.now();
        String out = "";
        String err = "";
        try {
            out = "".equals(dateFormat)
                    ? dt.toString()
                    : dt.format(DateTimeFormatter.ofPattern(dateFormat));
        } catch (Exception e) {
            err = e.getMessage();
        }
        return Response.ok().entity(
            "{"+
                "\"date\":\"" + out + "\"," +
                "\"errMsg\":\"" + err + "\"" +
            "}").build();
    }
}
