package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( //@Component 선언된거는 다 찾아서 빈으로 등록해줌
        // @Configuration 붙은 애도 자동으로 등록되기 때문에 필터링 해준다
        basePackages = "hello.core", //이렇게쓰면 member의 하위 파일만 탐색, default는 이 java파일의 경로부터 탐색=>hello.core
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
