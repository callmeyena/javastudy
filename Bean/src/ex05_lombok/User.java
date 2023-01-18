package ex05_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

 // 프로젝트 선택하고 오른쪽 Build path - configure Build path
 // 집에서 롬복 깔고 풀 해서 내려받아도 오류나면 애너테이션(@) 다 지우고 다시 입력해줘야한다
@Builder
@ToString
@NoArgsConstructor	 // = 디폴트 생성자
@AllArgsConstructor	 // = Generate Constructor using fields.. => 모든 매개변수를 받아오는 생성자
@Getter
@Setter
public class User {
	private String id;
	private String pw;

}
