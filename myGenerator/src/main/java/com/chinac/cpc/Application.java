package com.chinac.cpc;

import cn.org.rapid_framework.generator.GeneratorFacade;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 40298 on 2016/9/24.
 */
@SpringBootApplication
public class Application
{



    public static void main(String[] args) throws Exception
    {
        GeneratorFacade g = new GeneratorFacade();
        g.generateByTable("");
    }
}
