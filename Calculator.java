/* 
	����� ��������� �����������
*/
public class Calculator {
/*
	��������� ����������
*/
private float result;

/*
	��������� ���������
	@param params ��������� ������������
*/	
public void add(float ... params){
	for(Float param: params){
		this.result += param;
	}
}

public void sub(float ... params){
	float a[] = new float[2];
	for(Float param: params){
		for(int i = 0; i<params.length; i++){
		a[i] = params[i];
		}
		this.result = a[0] - a[1];
	}
}

public void mult(float ... params){
	float a[] = new float[2];
	for(Float param: params){
		for(int i = 0; i<params.length; i++){
		a[i] = params[i];
		}
		this.result = a[0] * a[1];
	}
}	
public void div(float ... params){
	float a[] = new float[2];
	for(Float param: params){
		for(int i = 0; i<params.length; i++){
		a[i] = params[i];
		}
		this.result = a[0] / a[1];
	}	
}

public void grade(float ... params){
	float a[] = new float[2];
	for(Float param: params){
		for(int i = 0; i<params.length; i++){
		a[i] = params[i];
		}
		this.result = (float)Math.pow(a[0], a[1]);
	}	
}
/*
	�������� ���������.
	@return ��������� ����������.
*/
public float getResult(){
	return this.result;
}
/*
	�������� ��������� ����������
*/
public void cleanResult(){
	this.result = 0;
	}
}