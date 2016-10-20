package com.mindtree.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.dao.EmployeeDao;
import com.mindtree.entity.EmployeeEntity;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addEmployee(EmployeeEntity employee) {
//		this.sessionFactory.getCurrentSession().save(employee);
		sessionFactory.openSession().save(employee);
		sessionFactory.close();
		
	}

	public List<EmployeeEntity> getAllEmployees() {
		 return this.sessionFactory.openSession().createQuery("From EmployeeEntity").list();
	}

	public void deleteEmployee(Integer employeeId) {
//			EmployeeEntity employee = (EmployeeEntity) sessionFactory.openSession().load(EmployeeEntity.class, employeeId);
//			if(employee!=null)
//			{
//				this.sessionFactory.openSession().delete(employeeId);
//			}
//			sessionFactory.close();
		String hql = "Delete from EmployeeEntity where employeeId= :id";
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Query query = session.createQuery(hql);
		query.setInteger("id", employeeId);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

}
