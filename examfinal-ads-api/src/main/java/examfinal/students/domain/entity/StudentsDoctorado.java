package examfinal.students.domain.entity;

public class StudentsDoctorado extends Students {

	  double montoBeca;

	    public StudentsDoctorado(double monto) {
	        this.montoBeca = montoBeca;
	    }
	@Override
	public double calcularMontoBeca() {
		this.montoBeca=10000.00;
		return 0;
	}

}
