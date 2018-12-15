package examfinal.students.domain.entity;



public abstract class Students {
	
	private long id;
	private Integer código;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Double montoBeca;
    private Integer tipo;
    
    public abstract double calcularMontoBeca();
    
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

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
   

}
