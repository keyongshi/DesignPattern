package com.sky.designpattern.visitor.visitor;

import com.sky.designpattern.visitor.visiable.VisitableA;
import com.sky.designpattern.visitor.visiable.VisitableB;
import com.sky.designpattern.visitor.visiable.VisitableChildA;
import com.sky.designpattern.visitor.visitor.Visitor;

/**
 * @author KeyongShi
 * @version 1.0
 * @since 2017/7/23.
 */
public class VisitorImpl implements Visitor {
    @Override
    public void visit(VisitableChildA visitableChildA) {
        visitableChildA.operator();
    }

    @Override
    public void visit(VisitableA visitableA) {
        visitableA.operator();
    }

    @Override
    public void visit(VisitableB visitableB) {
        visitableB.operator();
    }
}
