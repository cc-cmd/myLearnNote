package org.cc.test;

/**
 * @Description
 * <pre>
 *     lambda省略规则
 *     1. 参数类型可以不写
 *     2. 若只有一个参数，参数类型和（）都可以不写
 *     3. 若lambda表达式方法体只有一行代码，则{}可以省略不写，注意同时省略；，若该代码还是return语句，则return也可不写
 *     可添加方法引用进一步简化
 *     方法引用：
 *     1. 静态方法引用： 类名：：静态方法 Accumulate::getAllConstant()
 *     2.
 * </pre>
 * @Author cc
 * @Create 2023/9/21 23:04
 **/
public class Test_Lambda {

    //lambda表达式只能对有且只有一个函数的接口（函数式接口）进行简化！！抽象类则不可以
    //匿名内部类形式
    Swimming s = new Swimming() {
        @Override
        public void swim(String name) {
            System.out.println(name + "我在游泳");
        }
    };

    //lambda完整形式
    Swimming s1 = (String name) -> {
        System.out.println(name + "我在游泳~~");
    };

    //lambda完全省略形式
    Swimming s2 = name -> System.out.println(name + "我在游泳");

}

@FunctionalInterface
interface Swimming {
    void swim(String name);
}
