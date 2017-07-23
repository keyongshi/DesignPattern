package com.sky.designpattern.visitor.visiable;

import com.sky.designpattern.visitor.visitor.Visitor;

/**
 * @author KeyongShi
 * @version 1.0
 * @since 2017/7/23.
 */
public class VisitableChildA extends VisitableA {
    @Override
    public void visit(Visitor visitor) {
        System.out.println("VisitableChildA visit");
        visitor.visit(this);
    }

    @Override
    public void operator() {
        System.out.println("VisitableChildA operator");
    }
}
