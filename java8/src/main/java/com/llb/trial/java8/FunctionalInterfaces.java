package com.llb.trial.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * 学习 jdk 内置的函数式接口
 */
public class FunctionalInterfaces {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("apple");
        names.add("pear");
        names.add("banana");
        names.add("orange");

        //Predicates 一个输入参数，并且返回布尔值的函数式接口
        long count = names.stream().filter(name -> name.length() < 5).count();
        System.out.println(count);



    }

}
