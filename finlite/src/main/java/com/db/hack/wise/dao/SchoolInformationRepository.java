package com.db.hack.wise.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.db.hack.wise.model.SchoolInformationBean;

public interface SchoolInformationRepository extends CrudRepository<SchoolInformationBean,Long> {

	@Query("select schoolname from SchoolInformationBean where schoolname like %?1% OR zipcode like %?1% ")
	List<String> search(@Param("keyword") String keyword);

}