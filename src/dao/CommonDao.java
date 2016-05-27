/**
 *  项目名称：
 *  文件说明：
 *  主要特点：
 *  版本号：1.0
 *  制作人：刘晨曦
 *  创建时间：2013-12-3
 **/
package dao;

import java.util.List;

/**
 * @author lcx
 *
 */
public interface CommonDao<T> {

	public abstract T queryForObject(String tag);
	public abstract List<T> queryForList(String tag);
	public abstract List<T> queryLikeList(String tag);
	public abstract T insert(T obj);
	public abstract int delete(T obj);
	public abstract int update(T obj);
	
}
