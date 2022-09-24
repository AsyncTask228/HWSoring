package com.samsung.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DemoService {

    private final TestService testService;

    public void demo() {

        System.out.println("Enter your name:");
        testService.editName();

        System.out.println("We wish you successful testing!");
        testService.test();

        testService.showMark();

    }

}