package CH06;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//크롬서버.jar 다운로드 경로(셀레니움 공식 홈페이지)
//https://www.selenium.dev/downloads/

//크롬드라이브 다운로드 경로
//https://googlechromelabs.github.io/chrome-for-testing/#stable

public class C10SeleniumAPIMAIN {
	
	private static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	private static final String WEB_DRIVER_PATH = "src/Drivers/chromedriver.exe";

	public static void main(String[] args) {
//Selenium 3.x기준 브라우저 활성화 방법(4.x 부터는 chromedriver.exe를 윈도우path에 등록시 경로설정 필요없음)
		System.setProperty(WEB_DRIVER_ID , WEB_DRIVER_PATH);
		
		//크롬부라우저 옵션 설정--------------------------
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");		//백그라운드 실행
//		options.addArguments("--no-sandbox");	//리눅스 환경 sendbox 사용 여부
		
		//크롬브라우저 활성화---------------------------
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.naver.com");;
		
		// 특정 요소 위치 선택 (키워드 입력하기)------------------
		WebElement serchEl = driver.findElement(By.id("query"));
		//html 구조의 serchbox에 있는 id qeury를 넣음
		
		//키워드 입력 ------------------------------
		serchEl.sendKeys("모니터");
		
		//엔터키 전달
		serchEl.sendKeys(Keys.RETURN); //RETURN == 엔터키 효과
		
		//쇼핑버튼 클릭 (.api_flicking_wrap .tap:nth-child(1) )
		WebElement shoppingBtnEl = driver.findElement(By.cssSelector(".api_flicking_wrap .tap:nth-child(1)"));
		// 버튼의 html구조를 따와서 넣음
		
		//새창열기(target="_black") 제거 js코드를 건드는 작업
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].removeAttribute('target')",shoppingBtnEl);
		shoppingBtnEl.click(); //클릭 효과		
		
		//리뷰좋은 순 클릭(.subFilter_sort__4Q_hv._nlog_click._nlog_impression_element)
		WebElement reviewBtnEl = driver.findElement(By.cssSelector(".subFilter_sort__4Q_hv._nlog_click._nlog_impression_element"));
		reviewBtnEl.click(); //클릭 효과		
		
		//창닫기
		//driver.close();

	}

}
