package java_20191203;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class CrawlingDemo {
	public static void main(String[] args) {
//		String url = "http://www.imbc.com/";
//		String url = "https://sports.news.naver.com/index.nhn";
		String url = "https://m.sports.naver.com/";
		// HTML 문서 전체를 관리하기 위한 객체
//		Document doc = null;
		Document doc2 = null;
		
		try {
			doc2 = Jsoup.connect(url).get();
			System.out.println("성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*		
 		Elements elements = doc.select(".con-wrap.notice-wrap");
		Elements titleElements = elements.select("h3");
		String noticeTitle = titleElements.text();
		System.out.println(noticeTitle);
		
		Elements liElements = elements.select(".notice-list ul li");
		for (int i = 0; i < liElements.size(); i++) {
			Element liElement = liElements.get(i);
			String text = liElement.text();
			System.out.println(text);
			*/
		
		// (abs:href) abs:절대주소, 전체 주소를 가져오기 위한 작업
		
/*		Elements elements = doc.select("#news_category_contents_2_0 ul li");
		for (int i = 0; i < elements.size(); i++) {
			Element element = elements.get(i);
			String text = element.text();
			System.out.println(text);
		}*/
	}
}
