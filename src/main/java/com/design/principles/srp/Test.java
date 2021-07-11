package com.design.principles.srp;

/**
 * 单一职责(Simple Responsibility Principle,SRP)：不要存在多一个导致类变更的原因，
 * 在修改一个职责的逻辑代码时，不会导致另一个职责的功能发生故障
 * 提高类的可读性，可维护性，降低变更引起的风险
 * 总的来说就是一个Class/Interface/Method只负责意向职责
 */
public class Test {

    public static void main(String[] args) {
        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播");

        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("重播");
    }
}
