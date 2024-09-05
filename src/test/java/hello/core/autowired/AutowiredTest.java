package hello.core.autowired;

import hello.core.member.Member;
import jakarta.annotation.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);

    }

    static class TestBean {

        //true로 하면 Member가 빈으로 등록이 안되어있기때문에 오류가 발생
        //false면 그냥 호출 자체가 안됨 => Bean이 아니기때문에
        @Autowired(required = false)
        public void setNoBean1(Member noBean1) {
            System.out.println("noBean1: " + noBean1);
        }

        //호출은 되는데 null로 들어감
        @Autowired
        public void setNoBean2(@Nullable Member noBean2) {
            System.out.println("noBean2: " + noBean2);
        }

        //Optional.empty으로 들어감
        @Autowired
        public void setNoBean3(Optional <Member> noBean3) {
            System.out.println("noBean3: " + noBean3);
        }

    }
}
