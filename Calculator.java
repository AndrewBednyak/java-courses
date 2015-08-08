/* 
	Класс реализует калькулятор
*/
public class Calculator {
/*
	Результат вычисления
*/
private float result;

/*
	Суммируем аргументы
	@param params Аргументы суммирования
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
	Получить результат.
	@return результат вычисления.
*/
public float getResult(){
	return this.result;
}
/*
	Очистить результат вычисления
*/
public void cleanResult(){
	this.result = 0;
	}
}