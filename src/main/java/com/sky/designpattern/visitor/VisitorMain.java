package com.sky.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

import com.sky.designpattern.visitor.visiable.Visitable;
import com.sky.designpattern.visitor.visiable.VisitableA;
import com.sky.designpattern.visitor.visiable.VisitableB;
import com.sky.designpattern.visitor.visiable.VisitableChildA;
import com.sky.designpattern.visitor.visitor.Visitor;
import com.sky.designpattern.visitor.visitor.VisitorImpl;

/**
 * @author KeyongShi
 * @version 1.0
 * @since 2017/7/23.
 */
public class VisitorMain {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();

        List<Visitable> list = new ArrayList<>();
        list.add(new VisitableA());
        list.add(new VisitableB());
        list.add(new VisitableChildA());

        list.stream().forEach(a -> a.visit(visitor));
    }
}
