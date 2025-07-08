package co.simplon.workshop.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.workshop.entities.Project;
import co.simplon.workshop.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	private final ProjectRepository projects;
	
	public ProjectService(ProjectRepository projects) {
		this.projects = projects;
	}

	public List<String> getAll() {
		List<String> ret = new ArrayList<>();
		List<Project> dataList = projects.findAll();
		for (Project data : dataList) {
			ret.add(data.getName());
		}
		return ret;
	}
}
