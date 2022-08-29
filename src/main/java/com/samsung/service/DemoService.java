package com.samsung.service;

import com.samsung.domain.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

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