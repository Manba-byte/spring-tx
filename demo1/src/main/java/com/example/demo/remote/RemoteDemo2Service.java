package com.example.demo.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo2", fallback = RemoteDemo2Service.RemoteDemo2ServiceImpl.class)
public interface RemoteDemo2Service {

    @GetMapping("/RootController/get")
    String get();

    @GetMapping("/RootController/say")
    String say();

    @Service
    class RemoteDemo2ServiceImpl implements RemoteDemo2Service{
        @Override
        public String get() {
            return "Demo2 service get exception";
        }

        @Override
        public String say() {
            return "Demo2 service say exception";
        }
    }
}
