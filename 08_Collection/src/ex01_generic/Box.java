package ex01_generic;

public class Box<T> { // 정하는 방식/ new Box<int>() 정수 저장하는 박스가 된다 => T 타입으로 저장된다.
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	

}
