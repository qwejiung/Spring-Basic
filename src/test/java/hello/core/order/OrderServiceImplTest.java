package hello.core.order;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemoryMemberRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    @Test
    void createOrder() {
        MemoryMemberRepository MemberRepository = new MemoryMemberRepository();
        MemberRepository.save(new Member(1L, "aaaaa", Grade.VIP));


        OrderServiceImpl orderService = new OrderServiceImpl(MemberRepository, new FixDiscountPolicy());
        orderService.createOrder(1L, "aaaaa", 10000);

    }

}