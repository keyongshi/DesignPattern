package com.sky.designpattern.visitor.visiable;

import com.sky.designpattern.visitor.visitor.Visitor;

/**
 * @author KeyongShi
 * @version 1.0
 * @since 2017/7/23.
 */
public interface Visitable {
    void visit(Visitor visitor);
    void operator();
}
