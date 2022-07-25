package com.chainsys.springmvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.chainsys.springmvc.pojo.Appointments;

public interface AppointmentRepository extends CrudRepository<Appointments, Integer> {
	Appointments findById(int id);

	Appointments save(Appointments apt);

	// Used for both adding new Appointments and Modifying new Appointments
	void deleteById(int app_id);

	List<Appointments> findAll();
//	TODO native query
	@Query(value = 1 + "Select APPOINTMENT_ID as id from Appointments where rowid=(select max(rowid) from Appointments)", nativeQuery = true)
	int getNextId();
	
}
