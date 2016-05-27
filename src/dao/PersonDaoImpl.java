/**
 *  项目名称：
 *  文件说明：
 *  主要特点：
 *  版本号：1.0
 *  制作人：刘晨曦
 *  创建时间：2013-12-3
 **/
package dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Person;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * @author lcx
 *
 */
public class PersonDaoImpl implements CommonDao<Person>{

	Person person;
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

	@Override
	public Person queryForObject(String tag) {
		try {
			return (Person) client.queryForObject("Person.SelectPerson",tag);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}

	@Override
	public List<Person> queryForList(String tag) {
		try {
			return (ArrayList<Person>) client.queryForList("Person.SelectPersonAll");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}

	@Override
	public List<Person> queryLikeList(String tag) {

		try {
			return (ArrayList<Person>) client.queryForList("Person.SelectPersonFuzzy",tag);
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return null;
	}

	@Override
	public Person insert(Person obj) {
		try {
			return (Person) client.insert("Person.insertPerson", obj);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int delete(Person person) {
		try {
			client.delete("Person.DeletePerson", person.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return 0;
	}

	@Override
	public int update(Person obj) {
		try {
			return client.update("Person.UpdatePerson", obj);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return 0;
	}


}
