package com.naocun.leoj.jdk.common.demo;

import com.naocun.leoj.jdk.common.api.Search;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SPIExample {
    public static void main(String[] args) {
        ServiceLoader<Search> services = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = services.iterator();
        while (iterator.hasNext()) {
            Search search = iterator.next();
            search.searchDoc("hello world");
        }
    }
}
