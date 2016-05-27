/**
 *  ��Ŀ���ƣ�
 *  �ļ�˵����
 *  ��Ҫ�ص㣺
 *  �汾�ţ�1.0
 *  �����ˣ�������
 *  ����ʱ�䣺2013-12-3
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
