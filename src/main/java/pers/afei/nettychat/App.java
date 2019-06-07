package pers.afei.nettychat;

import pers.afei.nettychat.client.SimpleChatClient;
import pers.afei.nettychat.server.SimpleChatServer;

/**
 * 这个类基本没用,或者说方便打包用的吧(打包客户端和服务端不用改pom)，顺便演示了一下执行客户端和服务端的代码~~~
 * PATTERN为true则为服务端，为false则为客户端
 * 启动服务端可以执行pers.afei.nettychat.server.SimpleChatServer类
 * 启动客户端可以执行pers.afei.nettychat.client.SimpleChatClient类
 */
public class App 
{
    final static boolean PATTERN = false;
    public static void main( String[] args ) throws Exception
    {
        final int port = 8080;

        if(PATTERN) {
            new SimpleChatServer(port).run();
        } else {
            new SimpleChatClient("localhost", port).run();
        }
        
    }
}
