package my.app.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.springframework.web.servlet.view.InternalResourceViewResolver

@EnableWebMvc
@Configuration
open class WebMvcConfig : WebMvcConfigurerAdapter() {
	override fun configureDefaultServletHandling(configurer:DefaultServletHandlerConfigurer){
		configurer.enable()
	}
	
	@Bean
	open fun viewResolver():InternalResourceViewResolver {
		var resolver = InternalResourceViewResolver()
		resolver.setPrefix("/")
        resolver.setSuffix(".jsp")
        return resolver

	}
}