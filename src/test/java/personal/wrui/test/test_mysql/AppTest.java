package personal.wrui.test.test_mysql;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;

import personal.wrui.test.mysql.jpa.service.IPersonalService;
import personal.wrui.test.mysql.mybatis.mapper.PersonalMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
	@Lazy@Autowired
	private IPersonalService personalService;
	
	@Lazy@Autowired
	private PersonalMapper personalMapper;
	
	@Test
	public void insertTest() {
		System.out.println(personalService.insert("wrui", 12));
	}
	
	@Test
	public void findTest() {
		System.out.println(personalService.getAgeByName("wrui1"));
	}
	
	@Test
	public void countTest() {
		System.out.println(personalService.countByName("wrui1"));
	}
	
	@Test
	public void findByTest() {
		System.out.println(JSONObject.toJSONString(personalService.findByNameAndAge("wrui", 23)));
	}
	
	@Test
	public void pageByNameTest() {
		System.out.println(JSONObject.toJSONString(personalService.pageByName("wrui")));
	}
	
	
	
	@Test
	public void mybatisFindTest() {
		personalMapper.insertOne();
		System.out.println(JSONObject.toJSONString(personalMapper.findAll()));
	}
	
}
