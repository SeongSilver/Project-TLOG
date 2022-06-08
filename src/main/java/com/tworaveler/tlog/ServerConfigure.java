package com.tworaveler.tlog;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class ServerConfigure implements WebMvcConfigurer {
	
	static String[] interceptorArr = {
			"/mypage/*"
		};
	
	static String[] adminInterceptorArr = {"/admin/*"};
	
	private static final List<String> URL_PATERRNS = Arrays.asList(interceptorArr);
	private static final List<String> ADMIN_URL_PATERRNS = Arrays.asList(adminInterceptorArr);
	private static final List<String> URL_PATERRNS_RESET_PWD = Arrays.asList("/member/codeCheck", "/member/resetPwd", "resetPwdOk");
	
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns(URL_PATERRNS);
		registry.addInterceptor(new AdminLoginInterceptor()).addPathPatterns(ADMIN_URL_PATERRNS);
	}
	
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
		commonsMultipartResolver.setDefaultEncoding("UTF-8");
		return commonsMultipartResolver;
	}
}
