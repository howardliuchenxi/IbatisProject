package dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import model.Log;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * @author lcx
 *
 */
public class LogDaoImpl implements CommonDao<Log>{

	Log log;
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
	public Log queryForObject(String tag) {
		
		return null;
	}

	@Override
	public List<Log> queryForList(String tag) {
		return null;
	}

	@Override
	public List<Log> queryLikeList(String tag) {
		return null;
	}

	@Override
	public Log insert(Log obj) {
		try {
			return (Log) client.insert("Log.insertLog", obj);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int delete(Log obj) {
		return 0;
	}

	@Override
	public int update(Log obj) {
		return 0;
	}



}
