package examfinal.students.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import examfinal.common.api.controller.ResponseHandler;
import examfinal.students.application.StudentsApplicationService;
import examfinal.students.application.dto.StudentsDto;

@RestController
@RequestMapping("api/customers/{customerId}/accounts")
public class StudentsController {
	@Autowired
	StudentsApplicationService studentsApplicationService;
	
	@Autowired
	ResponseHandler responseHandler;
	
	
	
	@RequestMapping(method = RequestMethod.GET, path = "", produces = "application/json; charset=UTF-8")
    @ResponseBody
    ResponseEntity<Object> obtenerMontoBeca(@PathVariable("tipStudent") int tipo) {
        try {
            List<StudentsDto> students = studentsApplicationService.listarEstudiantes(tipo);
            return this.responseHandler.getDataResponse(students, HttpStatus.OK);
        } catch(IllegalArgumentException ex) {
			return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
		} catch(Exception ex) {
			ex.printStackTrace();
			return this.responseHandler.getAppExceptionResponse();
		}
    }
}
