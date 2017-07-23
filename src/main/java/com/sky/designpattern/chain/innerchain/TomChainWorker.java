package com.sky.designpattern.chain.innerchain;

public class TomChainWorker implements ChainWorker {

    @Override
    public void work(InnerChainWorker innerChainWorker) {
        System.out.println("TomChainWorker");
        innerChainWorker.work();
    }

}
