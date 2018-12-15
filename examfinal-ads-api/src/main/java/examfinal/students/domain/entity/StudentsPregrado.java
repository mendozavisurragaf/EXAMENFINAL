package examfinal.students.domain.entity;

public class StudentsPregrado extends Students{
	 double montoBeca;

	    public StudentsPregrado(double monto) {
	        this.montoBeca = montoBeca;
	    }
	@Override
	public double calcularMontoBeca() {
		// TODO Auto-generated method stub
		  this.montoBeca=5000.00;
	        return montoBeca;
	    }

	
	
	

}
