package com.pandy.desigin.pattern.prototype;

import lombok.Data;

/**
 * @author Pandy
 * 邮件类代码
 * Java中对象的克隆:
 *    1):实现Cloneable接口
 *    2):覆盖基类中的clone方法并声明为public
 *    3):在派生类的clone()方法中,调用super.clone()
 */
@Data
public class Mail implements Cloneable {

    //收件人
    private String receiver;
    //邮件名称
    private String subject;
    //称谓
    private String application;
    //邮件内容
    private String context;
    //邮件尾部
    private String tail;

    public Mail(AdvTemplate advTemplate){
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    //这是实现cloneable接口 之后新增的clone方法
    public Mail clone(){
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}
