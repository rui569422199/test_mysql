package personal.wrui.test.mysql.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import personal.wrui.test.mysql.jpa.pojo.dao.PersonalEntity;

public interface PersonalDao extends JpaRepository<PersonalEntity, Integer> {}