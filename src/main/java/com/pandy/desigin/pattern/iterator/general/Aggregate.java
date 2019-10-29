package com.pandy.desigin.pattern.iterator.general;

/**
 * @author Pandy
 * 抽象容器
 */
public interface Aggregate {
    //容器添加元素
    public void add(Object object);
    //减少元素
    public void remove(Object object);
    //由迭代器来遍历所有的元素
    public Iterator iterator();
}
