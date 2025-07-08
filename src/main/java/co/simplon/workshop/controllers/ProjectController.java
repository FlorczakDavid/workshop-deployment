package co.simplon.workshop.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.workshop.services.ProjectService;

@RestController
@RequestMapping("/projects")
public class ProjectController {
	private final ProjectService service;
	
	public ProjectController(ProjectService service) {
		this.service = service;
	}
	
	@GetMapping("/all")
	@ResponseStatus(HttpStatus.ACCEPTED)
	List<String> getAll() {
		return service.getAll();
	}
}
