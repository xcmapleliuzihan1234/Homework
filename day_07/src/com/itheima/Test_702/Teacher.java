package com.itheima.Test_702;
/*
 �붨���ʦ�ࣨTeacher�������԰��������͹��š�Ҫ��ֱ�ʹ�ÿղκ��вι��췽����������
 �ղδ����Ķ���ͨ��setXxx��ֵ���вδ����Ķ���ֱ�Ӹ�ֵ������̿Σ�teach��������
 ���������Ϊxxx��xxx��ʦ���ڽ��Ρ���
 */
public class Teacher {
    private String name;
    private int num;

    public Teacher() {
    }

    public Teacher(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void teach(){
        System.out.println("����Ϊ" + num + "��" + name + "��ʦ���ڽ���");
    }
}
class Test{
    public static void main(String[] args) {
        //�ղ�
        Teacher t1 = new Teacher();
        t1.setName("����");
        t1.setNum(666);
        t1.teach();
        //�в�
        Teacher t2 =new Teacher("����",888);
        t2.teach();
    }
}
