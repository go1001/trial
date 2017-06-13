package com.llb.trial.java8;

/**
 * 接口默认方法
 */
public interface Formula {

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }

}
class Test{

    public static void main(String[] args) {
        Formula formula = p -> p * 2;//没有@FunctionInterface 也可以，只要满足只有一个抽象方法即可

        System.out.println(formula.calculate(2));
        System.out.println(formula.sqrt(2));

        formula = Math::sqrt;
        System.out.println(formula.calculate(2));
        System.out.println(formula.sqrt(2));
    }
}
