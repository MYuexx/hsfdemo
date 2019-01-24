package com.example;

public interface AsyncEchoService {
    String future(String string);

    String callback(String string);
}
