package board.syu.service;

import board.syu.entity.TestEntity;
import board.syu.repository.TestRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@SpringBootTest
class TestServiceTestEntity {

    @Autowired
    TestRepository repository;

    @Transactional
    @Test
    @Rollback(value = false)
    public void test(){
        TestEntity test = new TestEntity("testName", 5);
        repository.save(test);


        Optional<TestEntity> testName = repository.findByTestName("testName");

        TestEntity testEntity = testName.get();

//        Assertions.assertThat(testEntity).isEqualTo(test);
        Assertions.assertThat(testEntity.getTestName()).isEqualTo("testNameee");
    }

}