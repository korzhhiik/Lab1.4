package com.main.first;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;

public class TestImpl implements Test {

    public void get(Object... values) {
        try {
            Test wrapped = wrappedInstance();
            System.err.println(wrapped);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private Test wrappedInstance() throws Exception {
        Class<?> proxyClass = Proxy.getProxyClass(Test.class.getClassLoader(), Test.class);
        InvocationHandler invocationHandler = (proxy, method, args) -> {
            var params = new LinkedHashMap<String, Object>(args.length);
            for (int i = 0; i < args.length; i++) {
                params.put(String.format("Argument is %d", i), args[i]);
            }
            return TestImpl.this.getClass().getMethod(method.getName(), method.getParameterTypes()).invoke(TestImpl.this, args);
        };
        return (Test) proxyClass.getConstructor(InvocationHandler.class).newInstance(invocationHandler);
    }
}

