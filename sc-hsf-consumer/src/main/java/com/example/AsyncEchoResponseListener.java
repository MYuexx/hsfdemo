/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AsyncEchoResponseListener
 * Author:   m.y
 * Date:     2018/11/23 3:38 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example;

import com.alibaba.boot.hsf.annotation.AsyncOn;
import com.taobao.hsf.exception.HSFException;
import com.taobao.hsf.tbremoting.invoke.CallbackInvocationContext;
import com.taobao.hsf.tbremoting.invoke.HSFResponseCallback;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author m.y
 * @create 2018/11/23
 * @since 1.0.0
 */
@AsyncOn(interfaceName = AsyncEchoService.class, methodName = "callback")
public class AsyncEchoResponseListener implements HSFResponseCallback {

    @Override
    public void onAppException(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onAppResponse(Object o) {
        Object timestamp = CallbackInvocationContext.getContext();
        System.out.println(timestamp + "   " + o);
    }

    @Override
    public void onHSFException(HSFException e) {
        e.printStackTrace();
    }
}