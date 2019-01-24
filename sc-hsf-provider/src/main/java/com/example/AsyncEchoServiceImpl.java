/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AsyncEchoServiceImpl
 * Author:   m.y
 * Date:     2018/11/23 3:27 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example;

import com.alibaba.boot.hsf.annotation.HSFProvider;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author m.y
 * @create 2018/11/23
 * @since 1.0.0
 */
@HSFProvider(serviceInterface = AsyncEchoService.class)
public class AsyncEchoServiceImpl implements AsyncEchoService {

    @Override
    public String future(String string) {
        return "hey,future " + string;
    }

    @Override
    public String callback(String string) {
        return "hey,callback " + string;
    }
}