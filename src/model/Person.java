/**
 *  项目名称：
 *  文件说明：
 *  主要特点：
 *  版本号：1.0
 *  制作人：刘晨曦
 *  创建时间：2013-12-3
 **/
package model;

/**
 * @author lcx
 *
 */
public class Person {

	private String id;
	private String name;
	private int score;
	
	@Override
	public String toString()
	{
		return "Person id="+id+" name="+name+" score="+score+"  hashcode  "+hashCode();
	}
	
	/**
	 * @param id
	 * @param name
	 * @param score
	 */
	public Person(String id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	/**
	 * 
	 */
	public Person() {
		super();
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
