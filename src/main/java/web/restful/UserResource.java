package web.restful;

import java.util.List;

import javax.persistence.criteria.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yammer.metrics.annotation.Timed;

import web.config.DataSourceFactory;
import web.entity.User;

@Path("/user")
public class UserResource {

	@GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Timed
    public List<User> index() throws Exception {
		
		CriteriaBuilder builder = DataSourceFactory.getSession().getCriteriaBuilder();
		CriteriaQuery<User> criteria = builder.createQuery( User.class );
		Root<User> root = criteria.from( User.class );
		criteria.select(root);
		criteria.where( builder.equal( root.get( "name" ), "zhsngq" ) );
		List<User> res = DataSourceFactory.getSession().createQuery( criteria ).getResultList();
		
		return res;
    }
}
