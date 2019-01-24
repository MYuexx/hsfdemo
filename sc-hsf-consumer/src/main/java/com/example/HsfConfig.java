/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HsfConfig
 * Author:   m.y
 * Date:     2018/11/29 11:35 AM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example;

import com.alibaba.boot.hsf.annotation.HSFConsumer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HsfConfig {
    @HSFConsumer
    private EchoService echoService;
    @HSFConsumer
    private AsyncEchoService asyncEchoService;
}