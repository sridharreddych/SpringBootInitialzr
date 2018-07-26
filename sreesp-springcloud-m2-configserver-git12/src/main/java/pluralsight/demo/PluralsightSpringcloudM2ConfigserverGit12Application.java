package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PluralsightSpringcloudM2ConfigserverGit12Application {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudM2ConfigserverGit12Application.class, args);
	}
}
