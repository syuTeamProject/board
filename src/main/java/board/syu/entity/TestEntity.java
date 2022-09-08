package board.syu.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TestEntity {

    @Id @GeneratedValue
    private Long id;

    private String testName;

    private int count;

    public TestEntity(String testName, int count) {
        this.testName = testName;
        this.count = count;
    }
}
