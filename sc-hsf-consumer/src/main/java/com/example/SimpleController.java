/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: SimpleController
 * Author:   m.y
 * Date:     2018/11/22 4:33 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author m.y
 * @create 2018/11/22
 * @since 1.0.0
 */

@RestController
public class SimpleController {
    @Autowired
    private EchoService echoService;

    @RequestMapping(value = "/hsf-echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return echoService.echo(str);
    }
}