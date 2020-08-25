package personal.wrui.test.mysql.jpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import personal.wrui.test.mysql.jpa.pojo.dao.PersonalEntity;
import personal.wrui.test.mysql.jpa.repository.PersonalDao;
import personal.wrui.test.mysql.jpa.service.IPersonalService;

@Service
public class PersonalServiceImpl implements IPersonalService {

	@Autowired@Lazy
	private PersonalDao personalDao;
	
	public Integer insert(String name, Integer age) {
		PersonalEntity personal=new PersonalEntity();
		personal.setName(name);
		personal.setAge(age);
		return personalDao.save(personal).getId();
	}

	@Override
	public Integer getAgeByName(String name) {
		PersonalEntity query=new PersonalEntity();
		query.setName(name);;
		Example<PersonalEntity> example=Example.of(query);
		List<PersonalEntity> result = personalDao.findAll(example);
		return result==null?null:result.get(0).getAge();
	}

	@Override
	public Integer countByName(String name) {
		return personalDao.countByName(name);
	}
	
	@Override
	public List<PersonalEntity> findByNameAndAge(String name, Integer age) {
		return personalDao.findByNameAndAge(name, age);
	}

	@Override
	public Page<PersonalEntity> pageByName(String name) {
		PersonalEntity query=new PersonalEntity();
		query.setName(name);
		Example<PersonalEntity> example=Example.of(query);
		Pageable pageable=new PageRequest(0, 10);
		return personalDao.findAll(example, pageable);
	}
}

