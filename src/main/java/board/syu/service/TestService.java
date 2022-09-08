package board.syu.service;

import board.syu.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestService {

    private final TestRepository testRepository;

    public void test(){
        testRepository.findAll();
        testRepository.findById(1L);
        testRepository.count();
        testRepository.deleteAll();
    }
}
