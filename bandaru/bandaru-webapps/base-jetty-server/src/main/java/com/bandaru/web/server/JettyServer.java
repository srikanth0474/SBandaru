package com.bandaru.web.server;

import org.eclipse.jetty.server.Server;

import com.bandaru.web.handler.HelloHandler;

public class JettyServer {

	public static void main(String[] args) throws Exception{
		
		Server server = new Server(8080);
		server.setHandler(new HelloHandler());
        server.start();
        server.join();
	}

}
