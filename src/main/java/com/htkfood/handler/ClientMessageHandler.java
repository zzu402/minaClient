package com.htkfood.handler;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class ClientMessageHandler extends IoHandlerAdapter  {
	   public void messageReceived(IoSession session, Object message) throws Exception {
	        String content = message.toString();
	        System.out.println("客户端接收消息:" + content);
	    }
	    
	    public void messageSent(IoSession session , Object message) throws Exception{
	        System.out.println("客户端发送消息：" + message);
	    }
	    
	    @Override
	    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
	    	System.out.println("服务器发生异常："+cause.getMessage());
	    }
}
