package personal.wrui.test.mysql.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import personal.wrui.test.mysql.jpa.pojo.dao.PersonalEntity;

public interface PersonalDao extends JpaRepository<PersonalEntity, Integer> {
	
	@Query("select count(*) from  PersonalEntity pe where pe.name =?1")
	Integer countByName(String name);
	
	List<PersonalEntity> findByNameAndAge(String name,Integer age);
}