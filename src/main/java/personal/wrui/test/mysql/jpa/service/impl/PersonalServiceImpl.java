package personal.wrui.test.mysql.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
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

}
