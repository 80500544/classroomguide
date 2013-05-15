package com.crazyteam.entity;

import java.util.Date;

import com.crazyteam.util.WeekDay;

/**
 * ����ʹ�����ʵ����
 * �洢�û���ϵͳ�ύ�Ľ̽���ʹ�����
 * @author jiangsuyong
 *
 */
public class ClassroomUseInfo {
	private Integer id;
	private Classroom classroom;//����
	private User user;
	/*��ʾ����״̬��
	*0��ʾ�ܿգ�1��ʾ���٣�
	*2һ�����ˣ�3�˶࣬4����*/
	private Integer state;
	private float weight;//�û������ö�Ȩ��
	/*
	 * �����û��ύ��ʱ�����ɶ�Ӧ��ʱ��
	 * ������ 7��00~7��30�ύ���ݣ��������ൽ7��30�ύ������
	 * ��һ��ֳ�47�Σ�������ʾһ���ʱ�䣬
	 * ���� 0��ʾ0��00 �� 1��ʾ0��30 ��2��ʾ 1��00
	 * ����һ��46��ʾ23��30 ������24:00��0��00һ��������
	 * ����һ��
	 *    */
	private Integer time;
	private WeekDay weekDay;
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public WeekDay getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(WeekDay weekDay) {
		this.weekDay = weekDay;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
