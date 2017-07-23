package com.sky.designpattern.visitor.visiable;

import com.sky.designpattern.visitor.visitor.Visitor;

/**
 * @author KeyongShi
 * @version 1.0
 * @since 2017/7/23.
 */
public class VisitableA implements Visitable {
    @Override
    public void visit(Visitor visitor) {
        System.out.println("VisitableA visit");
        visitor.visit(this);
    }

    @Override
    public void operator() {
        System.out.println("VisitableA operator");
    }
}
