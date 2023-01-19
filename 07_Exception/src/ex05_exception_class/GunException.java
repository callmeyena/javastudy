package ex05_exception_class;

/*
 	 예외 클래스(GunException) 만들기 // 별로 안중요 빡공 ㄴㄴ
 	 1. Exception 클래스를 상속 받는다.(필수)
 	 2. Exception 클래스의 슈퍼 클래스인 Throwable 클래스가 Serializable(=직렬화) 인터페이스를 구현하기 때문에 serialVersionUID 값을 가질 수 있다. (선택)
 	 	=> 부모가 이미 인터페이스를 구현하고 있어서 자식들도 영향을 받는다 
 */
public class GunException extends Exception {

	private static final long serialVersionUID = 3700059434730916901L;  // 2번의 예시
	
	private String exceptionCode;
	
	public GunException(String message, String exceptionCode) {
		super(message); // Exception
		this.exceptionCode = exceptionCode;
	}

	// getter & setter
	public String getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	
	

}
