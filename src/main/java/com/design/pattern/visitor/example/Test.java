package com.design.pattern.visitor.example;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        //构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("========CEO看报表===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========CTO看报表=============");
        report.showReport(new CTOVisitor());
    }
}
