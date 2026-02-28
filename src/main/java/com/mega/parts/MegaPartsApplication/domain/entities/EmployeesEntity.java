package com.mega.parts.MegaPartsApplication.domain.entities;

import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.CascadeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="employees")
public class EmployeesEntity{

			@Id	
			private UUID employee_id;
			private String first_name;
			private String last_name;
			private String email;
			private String phone_number;
			private LocalDateTime hire_date;


			@OneToOne(cascade = CascadeType.ALL)
			@JoinColumn(name = "job_id", referencedColumnName = "job_id")
			private JobsEntity job_id;
			private double salary;
			private double commission_pct;
			private String manager_id;
			
			
			@OneToOne(cascade = CascadeType.ALL)
			@JoinColumn(name = "department_id", referencedColumnName = "department_id")
			private DepartmentsEntity department_id;


			public String getFirst_name() {
				return first_name;
			}


			public void setFirst_name(String first_name) {
				this.first_name = first_name;
			}


			public String getEmail() {
				return email;
			}


			public void setEmail(String email) {
				this.email = email;
			}


			public String getPhone_number() {
				return phone_number;
			}


			public void setPhone_number(String phone_number) {
				this.phone_number = phone_number;
			}


			public LocalDateTime getHire_date() {
				return hire_date;
			}


			public void setHire_date(LocalDateTime hire_date) {
				this.hire_date = hire_date;
			}


			public JobsEntity getJob_id() {
				return job_id;
			}


			public void setJob_id(JobsEntity job_id) {
				this.job_id = job_id;
			}


			public double getSalary() {
				return salary;
			}


			public void setSalary(double salary) {
				this.salary = salary;
			}


			public double getCommission_pct() {
				return commission_pct;
			}


			public void setCommission_pct(double commission_pct) {
				this.commission_pct = commission_pct;
			}


			public String getManager_id() {
				return manager_id;
			}


			public void setManager_id(String manager_id) {
				this.manager_id = manager_id;
			}


			public DepartmentsEntity getDepartment_id() {
				return department_id;
			}


			public void setDepartment_id(DepartmentsEntity department_id) {
				this.department_id = department_id;
			}


			public UUID getEmployee_id() {
				return employee_id;
			}


			public void setEmployee_id(UUID employee_id) {
				this.employee_id = employee_id;
			}


			public String getLast_name() {
				return last_name;
			}


			public void setLast_name(String last_name) {
				this.last_name = last_name;
			}
			
			
			
}