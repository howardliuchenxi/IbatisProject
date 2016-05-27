/**
 *  ��Ŀ���ƣ�
 *  �ļ�˵����
 *  ��Ҫ�ص㣺
 *  �汾�ţ�1.0
 *  �����ˣ�������
 *  ����ʱ�䣺2013-12-3
 **/
package model;

import java.util.Date;

/**
 * @author lcx
 *
 */
public class Log {
	/**
	 * 
	 */
	public Log() {
		super();
	}

	private String id;
	private String dt;
	private String msg;
	/**
	 * @param id
	 * @param dt
	 * @param msg
	 */
	public Log(String id, String dt, String msg) {
		super();
		this.id = id;
		this.dt = dt;
		this.msg = msg;
	}
	
	public String toString()
	{
		return "Log id="+id+" dt ="+dt+" msg="+msg;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the dt
	 */
	public String getDt() {
		return dt;
	}

	/**
	 * @param dt the dt to set
	 */
	public void setDt(String dt) {
		this.dt = dt;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
