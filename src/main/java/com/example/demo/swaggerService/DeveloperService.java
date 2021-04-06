package com.example.demo.swaggerService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.swaggerDo.Developer;

@Service
public class DeveloperService {
	
	/*Developer list*/
	private List<Developer> developers = new ArrayList<>(
			Arrays.asList((new Developer("1", "Developer1", "Java,Spring Boot")),
					(new Developer("2", "Developer2", "Java,Spring Boot,REST,AWS"))));

	/*Get all developers*/
	public List<Developer> getAllDeveloper() {
		return developers;
	}
	
	/*Add a new developer*/
	public void addDeveloper(Developer developer) {

		developers.add(developer);
	}
	
	/*Update the developer*/
	public void updateDeveloper(Developer developer, String id) {
		for (Developer dev : developers) {
			if (dev.getId().equals(id)) {
				dev.setId(developer.getId());
				dev.setName(developer.getName());
				dev.setSkills(developer.getSkills());
			}
		}
	}
	
	/*Delete a developer*/
	public void deleteDeveloper(String id) {
		developers.removeIf(t -> t.getId().equals(id));
	}

}
