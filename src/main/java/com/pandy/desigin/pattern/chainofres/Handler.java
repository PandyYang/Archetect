package com.pandy.desigin.pattern.chainofres;

/**
 * @author Pandy
 * 抽象处理者
 */
public abstract class Handler {
    private Handler nextHandler;
    //每个处理者都必须对请求作出处理
    public final Response handlerMessage(Request request){
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())){
            response = this.echo(request);
        }else { //不属于自己的处理级别
            //判断是否有下一个处理者
            if (this.nextHandler != null){
                response = this.nextHandler.handlerMessage(request);
            }else {
                //...
            }
        }
        return response;
    }

    //设置下一个处理者是谁
    public void setNext(Handler _handler){
        this.nextHandler = _handler;
    }

    //每个处理者都有一个处理级别
    protected abstract Level getHandlerLevel();
    //每个处理者都必须实现处理任务
    protected abstract Response echo(Request request);
}
