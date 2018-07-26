package com.example.websocketdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app");
        registry.enableSimpleBroker("/topic");
    }
    
   /* public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app");

        // Use this for enabling a Full featured broker like RabbitMQ
        registry.enableStompBrokerRelay("/topic")
                .setRelayHost("192.168.56.100")
                .setRelayPort(5672)
                .setClientLogin("user")
                .setClientPasscode("password");
    }*/
    
   /* spring.rabbitmq.host=192.168.56.100
    		spring.rabbitmq.port=5672
    		spring.rabbitmq.username=user
    		spring.rabbitmq.password=password*/


    
}
