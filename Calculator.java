/* 
	����� ��������� �����������
*/
public class Calculator {
/*
	��������� ����������
*/
private int result;

/*
	��������� ���������
	@param params ��������� ������������
*/	
public void add(int ... params){
	for(Integer param: params){
		this.result += param;
	}
}

public void sub(int ... params){
	for(Integer param: params){
		
	}
}
/*
	�������� ���������.
	@return ��������� ����������.
*/
public int getResult(){
	return this.result;
}
/*
	�������� ��������� ����������
*/
public void cleanResult(){
	this.result = 0;
	}
}