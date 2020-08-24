package personal.wrui.test.test_mysql;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.junit4.SpringRunner;

import personal.wrui.test.mysql.jpa.service.IPersonalService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
	@Lazy@Autowired
	private IPersonalService personalService;
	
	@Test
	public void insertTest() {
		System.out.println(personalService.insert("wrui", 12));
	}
	
}
