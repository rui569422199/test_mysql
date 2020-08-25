package personal.wrui.test.mysql.jpa.service;

import java.util.List;

import org.springframework.data.domain.Page;

import personal.wrui.test.mysql.jpa.pojo.dao.PersonalEntity;

public interface IPersonalService {

	Integer insert(String name ,Integer age);
	
	Integer getAgeByName(String name);

	Integer countByName(String name);

	List<PersonalEntity> findByNameAndAge(String name, Integer age);

	Page<PersonalEntity> pageByName(String name);
}
