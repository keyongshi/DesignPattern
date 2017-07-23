package com.sky.designpattern.chain.innerchain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InnerChainWorker {
    private List<ChainWorker> workList;
    private Iterator<ChainWorker> workIterator;

    public InnerChainWorker(final ChainWorker ... chainwokers) {
        workList = new ArrayList<ChainWorker>();
        if(chainwokers != null){
            for (ChainWorker chainwoker : chainwokers) {
                workList.add(chainwoker);
            }
        }
        workIterator = workList.iterator();
    }
    
    public void work() {
        if (workIterator.hasNext()) {
            ChainWorker chainwork = workIterator.next();
            chainwork.work(this);
            
        }
    }
}
