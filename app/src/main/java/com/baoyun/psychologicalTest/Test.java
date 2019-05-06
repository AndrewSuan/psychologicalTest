package com.baoyun.psychologicalTest;

public class Test {
    private int test_minphoto;
    private int test_title;
    private int test_indroduction;
//    private int test_gobt;

    public Test(int test_minphoto, int test_title, int test_indroduction) {
        this.test_minphoto = test_minphoto;
        this.test_title = test_title;
        this.test_indroduction = test_indroduction;
    }

    public int getTest_minphoto() {
        return test_minphoto;
    }

    public void setTest_minphoto(int test_minphoto) {
        this.test_minphoto = test_minphoto;
    }

    public int getTest_title() {
        return test_title;
    }

    public void setTest_title(int test_title) {
        this.test_title = test_title;
    }

    public int getTest_indroduction() {
        return test_indroduction;
    }

    public void setTest_indroduction(int test_indroduction) {
        this.test_indroduction = test_indroduction;
    }
//
//    public int getTest_gobt() {
//        return test_gobt;
//    }
//
//    public void setTest_gobt(int test_gobt) {
//        this.test_gobt = test_gobt;
//    }
}
