package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class DemoCreatngZuluProxyAndExpermtngWithRouteZuulApiproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCreatngZuluProxyAndExpermtngWithRouteZuulApiproxyApplication.class, args);
	}
}
