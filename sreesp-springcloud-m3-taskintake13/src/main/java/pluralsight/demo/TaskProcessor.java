package pluralsight.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.cloud.task.launcher.TaskLaunchRequest;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Source.class)
public class TaskProcessor {
	
	@Autowired
	private Source source;
	
	public void publishRequest(String payload){
		
	//String url = "file://D:/spring%20boot%20Initializr/Spring%20boot%20intializr%20WS/pluralsight-springcloud-m3-task13/target/pluralsight-springcloud-m3-task13-0.0.1-SNAPSHOT";
		String url = "file://D:/SpringTaskTest/pluralsight-springcloud-m3-task13-0.0.1-SNAPSHOT.jar";
		
		
	//maven://[groupid]:[artifactid]:jar:[version]
			//String url = "maven://pluralsight.demo:pluralsight-springcloud-m3-task:jar:0.0.1-SNAPSHOT";
		
		List<String> input = new ArrayList<String>(Arrays.asList(payload.split(",")));
		
		TaskLaunchRequest request = new TaskLaunchRequest(url, input, null, null, null);
		
		System.out.println("created task request");
		
		GenericMessage<TaskLaunchRequest> message= new GenericMessage<>(request);
		this.source.output().send(message);
		
	}

}
