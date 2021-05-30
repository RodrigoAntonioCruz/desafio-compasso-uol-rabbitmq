package com.compasso.uol.configs;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Rodrigo da Cruz
 * @version 1.0
 * @since 2021-05-27
 *
 */

@Configuration
public class ConsumerRabbitConfig {
    @Bean
    public MessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }
}

