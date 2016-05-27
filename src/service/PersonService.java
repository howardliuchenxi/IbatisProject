/**
 *  ��Ŀ���ƣ�
 *  �ļ�˵����
 *  ��Ҫ�ص㣺
 *  �汾�ţ�1.0
 *  �����ˣ�������
 *  ����ʱ�䣺2013-12-3
 **/
package service;

import java.io.IOException;
import java.io.Reader;

import model.Person;
import dao.LogDaoImpl;
import dao.PersonDaoImpl;

/**
 * @author lcx
 *
 */
public class PersonService {

	private LogDaoImpl logDao=new LogDaoImpl();
	private PersonDaoImpl personDao=new PersonDaoImpl();

	public PersonService()
	{
		try {
			Reader reader=com.ibatis.common.resources.Resources.getResourceAsReader("sqlMapConfig.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	public boolean addPerson(Person person)
	{

		return true;
	}

	/**
	 * @return the logDao
	 */
	public LogDaoImpl getLogDao() {
		return logDao;
	}

	/**
	 * @param logDao the logDao to set
	 */
	public void setLogDao(LogDaoImpl logDao) {
		this.logDao = logDao;
	}

	/**
	 * @return the personDao
	 */
	public PersonDaoImpl getPersonDao() {
		return personDao;
	}

	/**
	 * @param personDao the personDao to set
	 */
	public void setPersonDao(PersonDaoImpl personDao) {
		this.personDao = personDao;
	}



}
