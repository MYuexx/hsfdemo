/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HelloReceiver
 * Author:   m.y
 * Date:     2018/11/29 10:31 AM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author m.y
 * @create 2018/11/29
 * @since 1.0.0
 */
@Component
@RabbitListener(queues = "topic.hellos")
public class HelloReceiver1 {
    @RabbitHandler
    public void process(String hello) {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消息接受为s：" + hello + "------" + new Date());
    }
}