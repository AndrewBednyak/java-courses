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
	for(Integer param: params){
		
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