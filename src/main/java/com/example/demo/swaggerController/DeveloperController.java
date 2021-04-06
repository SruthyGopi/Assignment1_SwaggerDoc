package com.example.demo.swaggerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.swaggerDo.Developer;
import com.example.demo.swaggerService.DeveloperService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


//mark class as Controller  
@RestController
@RequestMapping("/developer")
@Api(value="developer", description="Portal for Developers Details")
public class DeveloperController {
	@Autowired
	private DeveloperService developerService;
	
	@ApiOperation(value = "Get All Developers",response = Developer.class,tags=" Get Developer")
	 @RequestMapping(method=RequestMethod.GET)
	public List<Developer> getAllDeveloper() {
		return developerService.getAllDeveloper();
	}
	
	@ApiOperation(value = "Add a Developer",response = Developer.class,tags=" Add Developer")
	@RequestMapping(method=RequestMethod.POST)
	public String addDeveloper(@RequestBody Developer developer) {
		developerService.addDeveloper(developer); 
		return ("Developer is created successfully");
	}
	
	@ApiOperation(value = "Update Developer Details",response = Developer.class,tags=" Update Developer")
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public String updateDeveloper(@RequestBody Developer developer, @PathVariable String id) {
		developerService.updateDeveloper(developer,id);
		return ("Developer is updated successfully");
	}
	
	@ApiOperation(value = "Delete a Developer",response = Developer.class,tags="Delete Developer")
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public String deleteDeveloper( @PathVariable String id) {
		developerService.deleteDeveloper(id);
		return ("Developer is deleted successfully");
	}

}
