package examfinal.students.application.dto;

import java.math.BigDecimal;



public class StudentsDto {
	private long id;
	private Integer código;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Double montoBeca;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getCódigo() {
		return código;
	}

	public void setCódigo(Integer código) {
		this.código = código;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Double getMontoBeca() {
		return montoBeca;
	}

	public void setMontoBeca(Double montoBeca) {
		this.montoBeca = montoBeca;
	}

	
}
