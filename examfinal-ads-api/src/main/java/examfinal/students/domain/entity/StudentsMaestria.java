package examfinal.students.domain.entity;

public class StudentsMaestria extends Students {
	
	 double montoBeca;

	    public StudentsMaestria(double monto) {
	        this.montoBeca = montoBeca;
	    }
	    @Override
	    public double calcularMontoBeca() {
	        this.montoBeca=5000.00;
	        return montoBeca;
	    }

}
