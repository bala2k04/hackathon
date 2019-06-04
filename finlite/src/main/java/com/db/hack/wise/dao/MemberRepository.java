package com.db.hack.wise.dao;

import com.db.hack.wise.model.Member;
import com.db.hack.wise.model.MemberDetails;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by jones_vinu on 6/4/2019.
 */

public interface MemberRepository extends CrudRepository<Member,Long> {


	
}
