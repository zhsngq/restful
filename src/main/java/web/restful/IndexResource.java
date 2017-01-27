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
import web.entity.UserLoginLog;

@Path("/")
public class IndexResource {
	// test

	@GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Timed
    public List<UserLoginLog> index() throws HibernateException, Exception {
		List<UserLoginLog> res = DataSourceFactory.getSession()
				.createNativeQuery("select * from user_login_log",UserLoginLog.class)
				.getResultList();
		return res;
    }
}
