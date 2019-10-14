package com.pandy.desigin.pattern.creational.singlepattern.singletonextend;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Pandy
 * @version 1.0
 * @date 18:39
 * 扩展版本中希望控制对象的生成数为两三个
 */
public class Emperor {
    //定义最多能产生的实例数量
    private static int maxNumOfEmperor = 2;
    //每个对象都有名字 使用一个ArrayList来容纳 每个对象的私有属性
    private static ArrayList<String> nameList = new ArrayList<String>();
    //定义列表 容纳所有的皇帝实例
    private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
    //当前皇帝的序列号
    private static int countNumOfEmperor = 0;
    //产生所有的对象
    static {
        for (int i = 0;i<maxNumOfEmperor;i++){
            emperorList.add(new Emperor("黄"+(i+1) + "帝"));
        }
    }
    private Emperor(){
        //不产生第二个皇帝
    }
    //传入皇帝名称建立皇帝对象
    private Emperor(String name){
        nameList.add(name);
    }
    //随机获得一个皇帝 构造器声明为private 其他任何人无法创建 但是在该类的static内部 可以创建
    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }
    public void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }
}
