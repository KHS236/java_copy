package CH06;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.UUID;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C09JsoupMain {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		//URL연결 | 크롤링 할 URL 지정
		Connection conn = 
		Jsoup.connect("https://op.gg/lol/champions")
		//브라우저 정보
		     .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36")
		//timeout값 5초
		     .timeout(5000)
		     .ignoreHttpErrors(true)
		     .followRedirects(true);
		     
		//DOM 객체 받기
		Document document = conn.get();
//		System.out.println(document);
		Elements elements = document.getElementsByTag("img");
		System.out.println("총 img size : " + elements.size());
		
		for(Element el : elements) {
			String img_url = el.getElementsByAttribute("src").attr("src");
			// 가져온 이미지들의 src 안의 속성값을 꺼내는 .attr("src")
			System.out.println(img_url);
			
			URL url = (new URI(img_url)).toURL();
			InputStream in = url.openStream();//브라우저에 있는 내용을 자바로 가지고 오는 기능
			//보조스트림 추가 | 보조스트림(버퍼공간)추가
			BufferedInputStream buffIn = new BufferedInputStream(in);
		
			OutputStream out = null;
			if(img_url.contains(".png"))
				//파일 이름을 정해야하는데 랜덤으로 받아오기 UUID
				out = new FileOutputStream("C:\\IOTEST\\"+UUID.randomUUID()+".png");
			else if(img_url.contains(".svg"))
				out = new FileOutputStream("C:\\IOTEST\\"+UUID.randomUUID()+".png");
			else if(img_url.contains(".webp"))
				out = new FileOutputStream("C:\\IOTEST\\"+UUID.randomUUID()+".png");
			else if(img_url.contains(".jpg"))
				out = new FileOutputStream("C:\\IOTEST\\"+UUID.randomUUID()+".png");
			
			
			while(true) {
				int data = buffIn.read();
				if(data==-1)
					break;
				out.write((byte)data);
				out.flush();
			}
			out.close();
			buffIn.close();
			in.close();
			
		}
		
		
		
	}

}
