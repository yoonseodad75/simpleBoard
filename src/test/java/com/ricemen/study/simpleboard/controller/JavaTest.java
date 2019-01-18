package com.ricemen.study.simpleboard.controller;

import java.math.BigDecimal;

public class JavaTest {

    public static void main(String[] args) {
        InterfaceSample1 sample = (String name) -> {
            return name + " 입니다.";
        };

        System.out.println(sample.sampleMethod("조원석"));
    }
}
