package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;


@SpringBootApplication
@EnableTaskLauncher
public class PluralsightSpringcloudM3Tasksink13Application {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudM3Tasksink13Application.class, args);
	}
}
