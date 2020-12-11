package cc.insistor;

import cc.insistor.dao.repository.test.TestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CcTalentApplicationTests {

    @Autowired
    private TestRepository testRepository;
    @Test
    void contextLoads() {
        System.out.println("执行了！！！！");

    }

}
