package com.pandy.desigin.pattern.iterator.general;

import java.util.Vector;

/**
 * @author Pandy
 * 具体迭代器
 */
public class ConcreteIterator implements Iterator {

    private Vector vector = new Vector();
    private int cursor = 0;
    public ConcreteIterator(Vector _vector){
        this.vector = _vector;
    }
    @Override
    public Object next() {
        Object result = null;
        if (this.hasNext()){
            result = this.vector.get(this.cursor++);
        }else{
            result = null;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        if (this.cursor == this.vector.size()){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
