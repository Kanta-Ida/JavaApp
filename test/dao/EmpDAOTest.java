package dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import vo.EmpVO;

class EmpDAOTest {

	@Test

	void testEmpDAO() {

	}

	@Test
	void testGetAll() {
		//オブジェクトを生成
		EmpDAO empDAO = new EmpDAO("syain_test.txt");
		List<EmpVO> empList = empDAO.getAll();

		if (empList.size() != 5) {
			fail();
		}

	}

	@Test
	void testGet() {
		EmpDAO empDAO = new EmpDAO("syain_test.txt");
		EmpVO emp = empDAO.get(156704);
		assertEquals("156704", emp.getSyainNumber());
		assertEquals("Naoe Kanetugu", emp.getName());
		assertEquals("180", emp.getHeight());
		assertEquals("156704", emp.getWeight());

	}
1s	x
	@Test
	void testInsert() {
		EmpDAO empDAO = new EmpDAO("syain_test.txt");
		EmpVO emp = new EmpVO();
		emp.setSyainNumber("123456");
		emp.setName("Sato Taro");
		emp.setHeight("185");
		emp.setWeight("75");

		empDAO.insert(emp);

	}

}
