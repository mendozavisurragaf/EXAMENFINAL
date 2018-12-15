package students.transactions.domain.service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import examfinal.students.domain.entity.Students;



@ContextConfiguration({ "classpath:test-spring-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TransferDomainServiceTest {

    @Autowired
	//private TransferDomainService transferDomainService;
    private String monto = "50000.00";
  

	@Before
	public void setUp() {
	}



	@Test
	public void obtenerMontoBeca() throws Exception {
		//Students originBankAccount = enviaDatos();
		
	}


}
