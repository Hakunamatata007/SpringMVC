/**
 * 
 */
package com.mindtree.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.entity.EmployeeEntity;
import com.mindtree.service.EmployeeService;

/**
 * @author shashank
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {

	@InjectMocks
	EmployeeController employeeController;
	
	@Mock
	EmployeeService employeeService;
	
	
	@Test
	public void testSetEmployeeService() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.mindtree.controller.EmployeeController#addEmployee(com.mindtree.entity.EmployeeEntity)}.
	 */
	@Test
	public void testAddEmployee() {
		EmployeeEntity employee = new EmployeeEntity();
		employee.setEmail("abc@gmail.com");
		employee.setEmployeeId(101);
		employee.setFirstName("Shashank");
		employee.setLastName("Agrawal");
		employee.setTelephone("8680958867");
		
		doNothing().when(employeeService).addEmployee(employee);
		assertEquals("Added Successful", employeeController.addEmployee(employee));
		verify(employeeService,times(1)).addEmployee(employee);
	}

	/**
	 * Test method for {@link com.mindtree.controller.EmployeeController#listEmployee(org.springframework.web.servlet.ModelAndView)}.
	 */
	@Test
	public void testListEmployee() {
		ModelAndView mv= new ModelAndView();
		EmployeeEntity employee = new EmployeeEntity();
		List<EmployeeEntity> list = new ArrayList<EmployeeEntity>();
		employee.setEmail("abc@gmail.com");
		employee.setEmployeeId(101);
		employee.setFirstName("Shashank");
		employee.setLastName("Agrawal");
		employee.setTelephone("8680958867");
		list.add(employee);
		when(employeeService.getAllEmployees()).thenReturn(list);
		mv.setViewName("show");
		mv.addObject("listEmployee", list);
		assertEquals(mv,employeeController.listEmployee(mv));
		verify(employeeService,times(1)).getAllEmployees();
	}

	/**
	 * Test method for {@link com.mindtree.controller.EmployeeController#deleteEmployee(java.lang.String)}.
	 */
	@Test
	public void testDeleteEmployee() {
		doNothing().when(employeeService).deleteEmployee(12);
		assertEquals("Deleted Successfully",employeeController.deleteEmployee("12"));
		verify(employeeService,times(1)).deleteEmployee(12);
	}

}
