package Ch20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//커스텀 어노테이션
//클래스를 인터페이스화 시키고 앞에 @문자를 붙여서 어노테이션임을 명시
@Retention(RetentionPolicy.RUNTIME)
//@Retention() 어노테이션으로 유지기간을 명시할 수 있따
//어노테이션의 유지기간(프로그램 동작중인 상태에서만 실행)
@Target({ElementType.TYPE,ElementType.METHOD})
//@Target()은 현재 만들고 있는 어노테이션을 어디에 적용시킬지 (적용대상)을 제한하는 어노테이션
//ElementType.TYPE : 클래스 , 인터페이스 , eum... 적용
//ElementType.FIELD: 멤버 변수에 적용
//ElementType.METHOD: 메서드에 적용
public @interface CustomAnnotation {
	//default : 추상 메서드에 값이 없으면 Main에서 어노테이션 컴파일 에러가 발생하는데
	// 기본값을 지정해주는 방법임
	String value() default "HELLO WORLD";
	int number() default 100;
	boolean isOpen() default false;
	
	

}
