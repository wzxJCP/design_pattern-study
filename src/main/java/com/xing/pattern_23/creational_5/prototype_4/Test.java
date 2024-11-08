package com.xing.pattern_23.creational_5.prototype_4;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Pig peki = new Pig();
        // peki.setName("佩奇");
        // peki.setDoSomething("爱吃蛋糕。");
        // System.out.println(peki);
        //
        // Pig george  = new Pig();
        // george.setName("乔治");
        // george.setDoSomething("爱吃小鱼。");
        // System.out.println(george);
        //
        // Pig pekiDad = new Pig();
        // pekiDad.setName("佩奇的爸爸");
        // pekiDad.setDoSomething("喜欢开车");
        // System.out.println(pekiDad);
        //
        // Pig pekiMom = new Pig();
        // pekiMom.setName("佩奇的妈妈");
        // pekiMom.setDoSomething("喜欢做饭");
        // System.out.println(pekiMom);
        /**
         * Pig{name='佩奇', doSomething='爱吃蛋糕。'}com.xing.pattern_23.creational_5.prototype_4.Pig@7daf6ecc
         * Pig{name='乔治', doSomething='爱吃小鱼。'}com.xing.pattern_23.creational_5.prototype_4.Pig@421faab1
         * Pig{name='佩奇的爸爸', doSomething='喜欢开车'}com.xing.pattern_23.creational_5.prototype_4.Pig@2b71fc7e
         * Pig{name='佩奇的妈妈', doSomething='喜欢做饭'}com.xing.pattern_23.creational_5.prototype_4.Pig@5ce65a89
         */

        // 使用原型设计模式创建对象
        Pig peki1 =new Pig();
        peki1.setName("佩奇");
        peki1.setDoSomething("爱吃蛋糕。");
        System.out.println(peki1);

        Pig george1 = (Pig) peki1.clone();
        // george1.setName("乔治");
        // george1.setDoSomething("爱吃小鱼。");
        System.out.println(george1);

        Pig pekiDad1 = (Pig) peki1.clone();
        // pekiDad1.setName("佩奇的爸爸");
        // pekiDad1.setDoSomething("喜欢开车");
        System.out.println(pekiDad1);

        Pig pekiMom1 = (Pig) peki1.clone();
        // pekiMom1.setName("佩奇的妈妈");
        // pekiMom1.setDoSomething("喜欢做饭");
        System.out.println(pekiMom1);
        /**
         * 小猪被初始化了...
         * Pig{name='佩奇', doSomething='爱吃蛋糕。'}com.xing.pattern_23.creational_5.prototype_4.Pig@7daf6ecc
         * Pig{name='佩奇', doSomething='爱吃蛋糕。'}com.xing.pattern_23.creational_5.prototype_4.Pig@421faab1
         * Pig{name='佩奇', doSomething='爱吃蛋糕。'}com.xing.pattern_23.creational_5.prototype_4.Pig@2b71fc7e
         * Pig{name='佩奇', doSomething='爱吃蛋糕。'}com.xing.pattern_23.creational_5.prototype_4.Pig@5ce65a89
         */
    }
}
