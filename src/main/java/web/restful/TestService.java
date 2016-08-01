package web.restful;

import java.util.List;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

import web.config.BlogConfiguration;

public class TestService extends Service<BlogConfiguration> {
	
	public static void main(String[] args) throws Exception {
        new TestService().run(new String[] { "server" });
    }

    @Override
    public void initialize(Bootstrap<BlogConfiguration> bootstrap) {
        bootstrap.setName("blog");
    }

    @Override
    public void run(BlogConfiguration configuration, Environment environment) throws Exception {
    	environment.addResource(new IndexResource());
    }
}
