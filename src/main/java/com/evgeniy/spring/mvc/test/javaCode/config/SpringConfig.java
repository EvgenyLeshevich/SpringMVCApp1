/*
package com.evgeniy.spring.mvc.test.javaCode.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

// Этот класс заменяет applicationContext.xml
@Configuration
@ComponentScan("com.evgeniy.spring.mvc.test.javaCode") // Путь до контроллеров
@EnableWebMvc
public class SpringConfig implements WebMvcConfigurer { // Реализуем интерфейс WebMvcConfigurer, когда
    // хотим настроить под себя Spring mvc и в данном случае мы используем вместо стандартного шаблонизатора,
    // шаблонизатор thymeleaf
    private final ApplicationContext applicationContext;

    @Autowired
    public SpringConfig(ApplicationContext applicationContext) { // Внедряем ApplicationContext
        this.applicationContext = applicationContext;
    }

    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(applicationContext);
        templateResolver.setPrefix("/WEB-INF/views"); // Папка в которой буду лежать наши представления
        templateResolver.setSuffix(".html"); // Расширение представлений
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        templateEngine.setEnableSpringELCompiler(true);
        return templateEngine;
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) { // Передаём в этот метод информацию,
        // что мы хотим использовать шаблонизатор thymeleaf
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine());
        registry.viewResolver(resolver);
    }
}
*/
