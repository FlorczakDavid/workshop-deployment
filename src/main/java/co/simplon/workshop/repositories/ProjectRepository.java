package co.simplon.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.workshop.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	// （*>ω<）人（>ω<*）
}
