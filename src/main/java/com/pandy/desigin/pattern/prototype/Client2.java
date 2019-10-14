package com.pandy.desigin.pattern.prototype;

import java.util.Random;

/**
 * @author Pandy
 */
public class Client2 {
    private static int MAX_COUNT = 6;
    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT){
            Mail cloneMail = mail.clone();
            cloneMail.setApplication(getRandString(5) + "先生(女士)");
            cloneMail.setReceiver(getRandString(5) + "@" +getRandString(8)+".com");
            sendMail(cloneMail);
            i++;
        }
    }
    //发送邮件
    public static void sendMail(Mail mail){
        System.out.println("标题" + mail.getSubject() + "\t" +
                "收件人:" + mail.getReceiver() + "\t...发送成功");
    }
    //获得指定长度的随机字符串
    public static String getRandString(int maxLength){
        String source = "abcdefghijklmnoopqrstuvwxyzABCDEFGHIJKLMN";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0;i<maxLength;i++){
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
