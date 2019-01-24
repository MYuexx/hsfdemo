/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: EchoServiceImpl
 * Author:   m.y
 * Date:     2018/11/23 3:10 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example;

import com.alibaba.boot.hsf.annotation.HSFProvider;
import com.example.dao.User;
import com.example.dao.UserMapper;
import com.example.redis.RedisUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author m.y
 * @create 2018/11/23
 * @since 1.0.0
 */
@HSFProvider(serviceInterface = EchoService.class)
public class EchoServiceImpl implements EchoService {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public String echo(String string) {
        User user = userMapper.selectByPrimaryKey(1);
        redisUtil.set("my", user);
        User user1 = (User) redisUtil.get("my");
        System.out.println(user1.getCname());
        amqpTemplate.convertAndSend("exchange", "topic.hello", "hello rabbitMQ");
        amqpTemplate.convertAndSend("exchange", "topic.hellos", "hellos rabbitMQ");
        System.out.println(new Date());
        return "hello " + string;
    }
}