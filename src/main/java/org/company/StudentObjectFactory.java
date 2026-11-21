package org.company;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.util.List;
import java.util.Properties;

public class StudentObjectFactory extends DefaultObjectFactory {
    @Override
    public <T> T create(Class<T> type) {
        System.out.println("ObjectFactory creating: " + type.getSimpleName());
        return super.create(type);
    }

    @Override
    public <T> T create(Class<T> type,
                        List<Class<?>> constructorArgTypes,
                        List<Object> constructorArgs){
        System.out.println("ObjectFactory creating with args: " + type.getSimpleName());
        return super.create(type, constructorArgTypes, constructorArgs);
    }

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
    }
}
