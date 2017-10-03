package my.app.hello

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HelloController {
	
	@RequestMapping(value="/Hello")
	fun sayHello(): String{
		return "hi"
	}
}