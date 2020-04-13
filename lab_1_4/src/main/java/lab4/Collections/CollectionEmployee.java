package lab4.Collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lab4.dto.EmployeeEx;
	@Configuration
	public class CollectionEmployee 
	{
		private List<EmployeeEx> emplist=new ArrayList<EmployeeEx>();
		
		@Bean
		public List<EmployeeEx> getEmpList()
		{
			emplist.add(new EmployeeEx(100,"Joshi",80000.0));
			emplist.add(new EmployeeEx(101,"Ravindra",85000.0));
			emplist.add(new EmployeeEx(102,"Akshay",90000.0));
			emplist.add(new EmployeeEx(103,"Shiva",95000.0));

			return emplist;
		}

}