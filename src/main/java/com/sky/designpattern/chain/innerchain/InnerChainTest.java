package com.sky.designpattern.chain.innerchain;

public class InnerChainTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //开始工作之前将work以一种固定的方式组合到一起，放到一个bean中，对外屏蔽了里面的工作方式，降低了各个worker之前的耦合性，构造函数可以在spring的xml文件中配置，提供灵活性
        TomChainWorker tom = new TomChainWorker();
        JackChainWorker jack = new JackChainWorker();
        JackChainWorker jack1 = new JackChainWorker();
        InnerChainWorker inner = new InnerChainWorker(jack, tom, jack1);
        
        inner.work();

    }

}
