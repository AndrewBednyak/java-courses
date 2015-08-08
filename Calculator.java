/* 
	Класс реализует калькулятор
*/
public class Calculator {
/*
	Результат вычисления
*/
private int result;

/*
	Суммируем аргументы
	@param params Аргументы суммирования
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
	Получить результат.
	@return результат вычисления.
*/
public int getResult(){
	return this.result;
}
/*
	Очистить результат вычисления
*/
public void cleanResult(){
	this.result = 0;
	}
}