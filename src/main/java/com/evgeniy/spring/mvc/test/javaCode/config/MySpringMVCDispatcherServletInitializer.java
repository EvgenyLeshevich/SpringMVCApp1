package com.evgeniy.spring.mvc.test.javaCode.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// Этот класс заменяет web.xml
public class MySpringMVCDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() { // В этот метод подставляем наш класс SpringConfig
       // Теперь наш MySpringMVCDispatcherServletInitializer знает, где находится Spring конфигурация
        return new Class[] {SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() { // <!-- Любой url который вводит пользователь перенаправляется на наш DespatcherServlet -->
        return new String[] {"/"};
    }
}
