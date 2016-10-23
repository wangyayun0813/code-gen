package com.chinac.cpc.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * 文件名：
 * 描述：
 * 创建人： wangyayun
 * 创建时间： 2016/9/20.
 * 修改人：
 */
@Configuration
public class JavaConf
{
    @Bean
    public CharacterEncodingFilter characterEncodingFilter() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        return filter;
    }
}
