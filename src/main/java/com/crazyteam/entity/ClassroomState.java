package com.crazyteam.entity;

import java.util.Date;

/**
 * 
 * @author jiangsuyong
 *
 */
public class ClassroomState {
	private Integer id;
	private Integer state;//��ʾ����״̬��0��ʾ�ܿգ�1��ʾ���٣�2һ�����ˣ�3�˶࣬4����
	private Classroom classroom;//����
	/*Ϊ����ÿ�����������һ������״̬
	 * ����Ҫ��¼ʱ�䣬����״̬����ʱʱ�̶̿����ɣ�
	 * ���԰�һ��ֳ�47�Σ�������ʾһ���ʱ�䣬
	 * ���� 0��ʾ0��00 �� 1��ʾ0��30 ��2��ʾ 1��00
	 * ����һ��46��ʾ23��30 ������24:00��0��00һ��������
	 * ����һ�� */
	private Integer time;
	private Date day;//����
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
}
