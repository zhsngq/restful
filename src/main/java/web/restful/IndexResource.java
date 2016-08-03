package web.restful;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.jetty.server.Authentication.User;
import org.hibernate.HibernateException;

import com.yammer.metrics.annotation.Timed;

import web.config.DataSourceFactory;

@Path("/")
public class IndexResource {

	@GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Timed
    public List<User> index() throws HibernateException, Exception {
		return null;
    }
}
