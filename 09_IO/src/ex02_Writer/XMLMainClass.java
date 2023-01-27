package ex02_Writer;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLMainClass {

	/*
	 	XML
	 	1. extensible Markup Language
	 	2. HTML(표준 마크업 언어)의 확장 버전
	 	3. 정해진 태그 외 사용자 정의 태그의 사용이 가능하다.
	*/
	
	/*
		목표!
			1. 경로
		 		C:\storage\product.Xml
		 	2. 내용 // 문서를 객체로 봐서 문서 자체는 document, 문서에 들어가는 각종 태그들은 element라고 부르고 => dom(Document Object Model) 처리방식
		 	<products> : 시작 태그 => 모든 태그는 항상 시작과 끝이 있다 / products의 부모는 product.xml 파일 
		 		<product>
		 			<model>세탁기</model> // 태그 사이의 이름을 textContent라고 부른다
		 			<marker>삼성</maker>
		 			<price>100</price>
		 		</product>
		 	</products> : 종료 태그
		 	<products> 
		 		<product>
		 			<model>냉장고</model>
		 			<marker>LG</maker>
		 			<price>200</price>
		 		</product>
		 	</products> 
		 	<products> 
		 		<product>
		 			<model>TV</model>
		 			<marker>삼성</maker>
		 			<price>300</price>
		 		</product>
		 	</products> 
	*/
	
	public static void main(String[] args) {
		
		Map<String, Object> product1 = new HashMap<String, Object>();
		 product1.put("model", "세탁기");
		 product1.put("maker", "삼성");
		 product1.put("price", 100);
		 
		 Map<String, Object> product2 = new HashMap<String, Object>();
		 product2.put("model", "냉장고");
		 product2.put("maker", "LG");
		 product2.put("price", 200);
		 
		 Map<String, Object> product3 = new HashMap<String, Object>();
		 product3.put("model", "TV");
		 product3.put("maker", "삼성");
		 product3.put("price", 300);
		
		 List<Map<String, Object>> productList = Arrays.asList(product1, product2, product3);
		 
		 try {
			 
			 // 1번. Document 생성(Document는 XML문서 자체를 의미한다.)
			 DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();	// documentbuilder 를 뽑아냄
			 DocumentBuilder builder = factory.newDocumentBuilder();
			 Document document = builder.newDocument();
			 document.setXmlStandalone(true); 						// standalone = "no" 제거하기
			 
			 // <products> 태그: element 생성
			 Element products = document.createElement("products");
			 document.appendChild(products);
			 
			 // productList 순회
			 for(Map<String, Object> map : productList) {
				 
				 // <product> 태그: Element 생성
				 Element product = document.createElement("product");
				 products.appendChild(product);
				 
				 // <model> 태그: Element 생성
				 Element model = document.createElement("model");
				 product.appendChild(model);
				 model.setTextContent((String)map.get("model"));	 // setTextContent 메소드는 무조건 String 타입을 넣어야 함
				 
				 // <maker> 태그: Element 생성
				Element maker = document.createElement("maker");
				product.appendChild(maker);
				maker.setTextContent((String)map.get("maker"));
			
				 // <price> 태그: Element 생성
				Element price = document.createElement("price");
				product.appendChild(price);
				price.setTextContent((int)map.get("price") + ""); 
			 }
			 
			 // XML 설정
			 TransformerFactory transformerFactory = TransformerFactory.newInstance();
			 Transformer transformer = transformerFactory.newTransformer();
			 transformer.setOutputProperty("encoding", "UTF-8");
			 transformer.setOutputProperty("indent", "yes"); 			// 들여쓰기
			 transformer.setOutputProperty("doctype-public", "yes"); 	// standalone = "no" 제거하기
			 
			 
			 // XML 문서 만들기
			 File dir = new File("C:" + File.separator + "storage");
			 if(dir.exists() == false) {
				 dir.mkdirs();
			 }
			 File file = new File(dir, "product.xml");
			 Source source = new DOMSource(document);
			 StreamResult stremResult = new StreamResult(file);
			 transformer.transform(source, stremResult);
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		 
		 
		 
		 
		 
		 
	}

}
