package personal.wrui.test.mysql.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import personal.wrui.test.mysql.mybatis.pojo.dao.Personal;

@Mapper
public interface PersonalMapper  {
	
	List<Personal> findAll();
	
	Integer insertOne();

}
