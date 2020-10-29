package com.dolphin;


import com.dolphin.TimeTool.Task;

public class Fibonacci {
    public static void main(String[] args) {
/*        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));*/
        //递归无法计算
        //System.out.println(fib(64));
        //for循环计算
        final int n = 46;
        TimeTool.check("fib1", new Task() {
            @Override
            public void execute() {
                System.out.println(fib(n));
            }
        });

        TimeTool.check("fib2", new Task() {
            @Override
            public void execute() {
                System.out.println(fib2(n));
            }
        });
    }

    /**
     * 递归方式现实
     * 缺点：性能问题
     *
     * @param n
     * @return
     */
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * for 循环
     * @param n
     * @return
     */
    public static int fib2(int n) {
        if (n <= 1) {
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }
}
