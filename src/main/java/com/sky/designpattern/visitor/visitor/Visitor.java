package com.sky.designpattern.visitor.visitor;

import com.sky.designpattern.visitor.visiable.VisitableA;
import com.sky.designpattern.visitor.visiable.VisitableB;
import com.sky.designpattern.visitor.visiable.VisitableChildA;

/**
 * @author KeyongShi
 * @version 1.0
 * @since 2017/7/23.
 */
public interface Visitor {
    void visit(VisitableChildA visitableChildA);
    void visit(VisitableA visitableA);
    void visit(VisitableB visitableB);
}
