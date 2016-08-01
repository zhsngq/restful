package web.restful;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.HibernateException;

import com.yammer.metrics.annotation.Timed;

import web.config.DataSourceFactory;

@Path("/")
public class IndexResource {

	@SuppressWarnings("unchecked")
	@GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Timed
    public List<Object> index() throws HibernateException, Exception {
		List<Object> res = DataSourceFactory.getSession().createNativeQuery("SELECT ev_buyer.buyer_name from ev_buyer").getResultList();
		for(Object i : res){
			System.out.println(i.toString());
		}
        return res;
    }
}
