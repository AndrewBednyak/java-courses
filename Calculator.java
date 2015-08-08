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
	int a[] = new int[2];
	for(Integer param: params){
		for(int i = 0; i<params.length; i++){
		a[i] = params[i];
		}
		this.result = a[0] - a[1];
	}
}

public void mult(int ... params){
	int a[] = new int[2];
	for(Integer param: params){
		for(int i = 0; i<params.length; i++){
		a[i] = params[i];
		}
		this.result = a[0] * a[1];
	}
}	
public void div(int ... params){
	int a[] = new int[2];
	for(Integer param: params){
		for(int i = 0; i<params.length; i++){
		a[i] = params[i];
		}
		this.result = a[0] / a[1];
	}	
}

public void grade(int ... params){
	int a[] = new int[2];
	for(Integer param: params){
		for(int i = 0; i<params.length; i++){
		a[i] = params[i];
		}
		this.result = a[0] ^ a[1];
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