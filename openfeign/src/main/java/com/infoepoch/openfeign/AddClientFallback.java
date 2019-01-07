package com.infoepoch.openfeign;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class AddClientFallback implements AddClient {
    @Override
    public String add(@RequestParam Integer a, @RequestParam Integer b) {
        return "Fallback";
    }
}