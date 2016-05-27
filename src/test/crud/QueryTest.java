package test.crud;


import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Person;

import org.junit.Test;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * 一定要注意，linux对表名是区分大小写的
 *  测试：1.单例查询 2.集合查询 3.模糊查询
 *  
 **/

public class QueryTest {

	static SqlMapClient client;
	static
	{
		try {
			Reader reader=com.ibatis.common.resources.Resources.getResourceAsReader("sqlMapConfig.xml");
			client=com.ibatis.sqlmap.client.SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 查询一个Object
	 */
	@Test
	public void testQueryForObject()
	{
		try {
			Person person1=(Person) client.queryForObject("Person.SelectPerson","1");
			System.out.println(".......查询一个人");
			System.out.println(person1);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}


	/**
	 * 查询所有人
	 * 
	 */
	@Test
	public void testQueryForAll()
	{
		try {
			List<Person> persons=(ArrayList<Person>) client.queryForList("Person.SelectPersonAll");
			System.out.println(".......查询所有人");
			System.out.println(persons);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

	/**
	 * 查询所有人
	 * 
	 */
	@Test
	public void testFuzzyQuery()
	{
		try {
			List<Person> persons=(ArrayList<Person>) client.queryForList("Person.SelectPersonFuzzy","1");
			System.out.println(".......模糊查询");
			System.out.println(persons);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
