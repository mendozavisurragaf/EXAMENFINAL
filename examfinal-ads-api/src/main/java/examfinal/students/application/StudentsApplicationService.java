package examfinal.students.application;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.config.Configuration.AccessLevel;
import org.modelmapper.convention.NamingConventions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import examfinal.students.application.dto.StudentsDto;
import examfinal.students.domain.entity.Students;
import examfinal.students.domain.repository.StudentsRepository;

@Service
public class StudentsApplicationService {
	@Autowired
	StudentsRepository studentsRepository;
	
	
	
	@Autowired
	private ModelMapper mapper;
    
	
	
	public List<StudentsDto> listarEstudiantes(int tipo) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration()
	      .setFieldMatchingEnabled(true)
	      .setFieldAccessLevel(AccessLevel.PRIVATE)
	      .setSourceNamingConvention(NamingConventions.JAVABEANS_MUTATOR);
		List<Students> students = this.studentsRepository.listarEstudiantes(tipo);
		List<StudentsDto> studentsDto = modelMapper.map(students, new TypeToken<List<StudentsDto>>() {}.getType());
        return studentsDto;
    }
	

}
