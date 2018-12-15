package examfinal.students.domain.repository;

import java.util.List;


import examfinal.students.domain.entity.Students;

public interface StudentsRepository {

	List<Students> listarEstudiantes(int tipo);
	
}
