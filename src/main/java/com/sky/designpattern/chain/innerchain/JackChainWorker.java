package com.sky.designpattern.chain.innerchain;

public class JackChainWorker implements ChainWorker {

    @Override
    public void work(InnerChainWorker innerChainWorker) {
        System.out.println("JackChainWorker");
        innerChainWorker.work();
    }

}
