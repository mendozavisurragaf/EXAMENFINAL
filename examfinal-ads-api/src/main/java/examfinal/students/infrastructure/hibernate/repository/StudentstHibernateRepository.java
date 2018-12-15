package examfinal.students.infrastructure.hibernate.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import examfinal.common.infrastructure.hibernate.repository.BaseHibernateRepository;
import examfinal.students.domain.entity.Students;
import examfinal.students.domain.repository.StudentsRepository;

@Transactional
@Repository
public class StudentstHibernateRepository extends BaseHibernateRepository<Students>
		implements StudentsRepository {

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Students> listarEstudiantes(int tipo) {
		List<Students> students = null;
		Criteria criteria = getSession().createCriteria(Students.class, "a");
		criteria.createAlias("a.student", "c");
		criteria.add(Restrictions.eq("c.tipo", tipo));
		students = criteria.list();
		return students;
	}
	

}
