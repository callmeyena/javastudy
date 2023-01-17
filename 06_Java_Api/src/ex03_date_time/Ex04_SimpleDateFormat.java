package ex03_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04_SimpleDateFormat { // 암기
	
	public static void ex01() {

	/*
	  	빨리 외워주시궜어요?
	  형식(pattern) 2023년 01월 17일 14시 08분 기준
	  1. yy: 년도/ 00년 ex)23년
	  2. yyyy: 0000년 ex)23년
	  3. M:월/ 0월 ex)1월
	  4. MM: 0월 ex)01월
	  5. MMM: ex)01월 => 각 나라의 표기에 맞게 작성해라
	  6. d: 일/ 17일 => 오늘날짜
	  7. dd: 17일
	  8. E: 요일/ 화 => 오늘 요일
	  9. a: 오후
	  10. h: 시간/ 2시 (1~12시)
	  11. hh: 02시 (01~12시)
	  12. H: 14시 (0~23시)
	  13. HH: 14시 (00~23시)
	  14. m: 8분 (0~59)
	  15. mm: 08분 (00~59)
	  16. s : 30초 (0~59)
	  17. ss: 30초 (00~59)
	*/
		
	}
	public static void main(String[] args) {
		ex01();
		
		Date date = new Date();
		System.out.println(date);
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
		Date now2 = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy/MM/dd HH:mm::ss");
		String strNow2 = sdf2.format(now2);
		System.out.println(strNow2);
		
		Date now3 = new Date();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd a hh:mm:ss");
		String strNow3 = sdf3.format(now3);
		System.out.println(strNow3);
		
		Date now4 = new Date();
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strNow4 = sdf4.format(now4);
		System.out.println(strNow4);
	}

}
