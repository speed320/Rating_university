package ru.ystu.math.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Value("${rabbitmq.queues.calculation}")
    private String queueName;

    @Value("${RABBITMQ_RATING_EXCHANGE:rating.exchange}")
    private String exchangeName;

    @Value("${RABBITMQ_ROUTING-KEY:rating.calculation}")
    private String routingKey;

    @Bean
    public Queue calculationQueue() {
        return new Queue(queueName, true);
    }

    @Bean
    public TopicExchange ratingExchange() {
        return new TopicExchange(exchangeName);
    }

    @Bean
    public Binding binding(Queue calculationQueue, TopicExchange ratingExchange) {
        return BindingBuilder.bind(calculationQueue).to(ratingExchange).with(routingKey);
    }

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
