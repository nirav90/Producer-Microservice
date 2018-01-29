/**
 * 
 */
package com.microservice.producer;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author niravprajapati
 *
 */
@RestController
public class ProducerController {

	protected Logger logger = Logger.getLogger(ProducerController.class.getName());
	
	@RequestMapping("/producer")
	public String producer() {
		logger.info("producer-microservice byId() invoked: ");
		System.out.println("producer-microservice byId() invoked: ");
		return "Hello world";
	}
}