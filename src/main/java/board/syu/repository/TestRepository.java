package board.syu.repository;

import board.syu.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TestRepository extends JpaRepository<TestEntity,Long> {

    Optional<TestEntity> findByTestName(String testName);
}
