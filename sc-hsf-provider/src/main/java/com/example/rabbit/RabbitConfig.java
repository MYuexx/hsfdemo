/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: RabbitConfig
 * Author:   m.y
 * Date:     2018/11/29 10:22 AM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.rabbit;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author m.y
 * @create 2018/11/29
 * @since 1.0.0
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue queueMessage() {
        return new Queue("topic.hello");
    }

    @Bean
    public Queue queueMessages() {
        return new Queue("topic.hellos");
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("exchange");
    }

    //将队列和交换机进行绑定
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.hello");
    }

    @Bean
    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }
}