package com.chandradeep.springAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springannotations.forbeanthings.InjectingBeanDependencies;
import com.springannotations.forbeanthings.TextEditor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        College cg = context.getBean(College.class);
//        cg.details();
        
        ApplicationContext context1 = new AnnotationConfigApplicationContext(InjectingBeanDependencies.class);
        TextEditor te = context1.getBean(TextEditor.class);
        te.show();
    }
}
