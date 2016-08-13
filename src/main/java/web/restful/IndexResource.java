package web.restful;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.HibernateException;

import com.yammer.metrics.annotation.Timed;

import web.config.DataSourceFactory;
import web.entity.User;

@Path("/")
public class IndexResource {

	@GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Timed
    public List<User> index() throws HibernateException, Exception {
		List<User> res = DataSourceFactory.getSession()
				.createNativeQuery("select * from user",User.class)
				.getResultList();
		return res;
    }
}
