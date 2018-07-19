package com.earthteam.ocr.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.earthteam.ocr.domain.Appointment;

/**
 * 
 * @author Cong Khanh Tran - trancongkhanh@gmail.com
 *
 *
 */
@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

	@Query("SELECT a FROM Appointment a WHERE a.doctor.id = :doctorId")
	List<Appointment> findByDoctorId(@Param("doctorId") long doctorId);
	
	@Query("SELECT a FROM Appointment a WHERE a.doctor.id = :doctorId AND a.date = :date")
	List<Appointment> findByDoctorIdAndDate(@Param("doctorId") Long doctorId, @Param("date") Date date);

}
