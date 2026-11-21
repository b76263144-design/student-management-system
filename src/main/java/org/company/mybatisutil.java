package org.company;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

public class mybatisutil {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "mapper/mybatis-config.xml";
            System.out.println("Loading MyBatis config from: " + resource);
            InputStream inputStream = Resources.getResourceAsStream(resource);
            System.out.println("MyBatis config loaded successfully!");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            System.out.println("SqlSessionFactory created successfully!");
        } catch (IOException e) {
            System.err.println("Failed to load MyBatis config: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Failed to build SqlSessionFactory: " + e.getMessage(), e);
        } catch (Exception e) {
            System.err.println("Failed to create SqlSessionFactory: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Failed to create SqlSessionFactory: " + e.getMessage(), e);
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public static SqlSession openSession() {
        if (sqlSessionFactory == null) {
            throw new IllegalStateException("SqlSessionFactory is not initialized!");
        }
        return sqlSessionFactory.openSession(true);
    }

}