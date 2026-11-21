package org.company;

import org.eclipse.jetty.jsp.JettyJspServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class JettyServer {

    public static void main(String[] args) {
        System.out.println(">>> 正在启动 Jetty 服务器...");
        try {
            Server server = new Server(8080);

            ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
            context.setContextPath("/");

            // 1. 设置 Web 根目录 (使用绝对路径)
            String webAppDir = new File("src/main/resources/webapp").getCanonicalPath();
            context.setResourceBase(webAppDir);
            System.out.println(">>> Web 资源目录: " + webAppDir);

            // 2. 配置 Spring MVC DispatcherServlet
            ServletHolder springServlet = new ServletHolder("dispatcher", DispatcherServlet.class);
            springServlet.setInitOrder(1);
            springServlet.setInitParameter("contextConfigLocation", "classpath:spring-mvc.xml");
            // 映射到根路径，接管所有请求
            context.addServlet(springServlet, "/");
            System.out.println(">>> Spring MVC 已配置");

            // 3. 注册 JSP 解析器
            ServletHolder holderJsp = new ServletHolder("jsp", JettyJspServlet.class);
            holderJsp.setInitOrder(0);
            holderJsp.setInitParameter("logVerbosityLevel", "DEBUG");
            holderJsp.setInitParameter("compilerSourceVM", "11");
            holderJsp.setInitParameter("compilerTargetVM", "11");
            context.addServlet(holderJsp, "*.jsp");
            System.out.println(">>> JSP 解析器已注册");

            // 4. 【修复】已移除冲突的 DefaultServlet 配置
            // DispatcherServlet 映射到 "/" 已经足够，移除 DefaultServlet 避免路径冲突

            server.setHandler(context);

            server.start();
            System.out.println(">>> 服务器启动成功! 请访问: http://127.0.0.1:8080/students");
            server.join(); // 保持服务器运行

        } catch (Exception e) {
            System.err.println(">>> 启动失败! 请检查下方错误信息:");
            e.printStackTrace();
        }
    }
}
