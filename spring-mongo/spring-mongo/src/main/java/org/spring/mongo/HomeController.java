package org.spring.mongo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Value("${spring.version}")
	private String springVersion;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("Welcome home! {}", springVersion);
		return "home";
	}
	
}
