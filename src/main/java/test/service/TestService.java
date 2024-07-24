package test.service;

import java.util.List;

public class TestService {

    public Double average(List<Integer> list){
        return list.stream()
                .mapToDouble(Integer::doubleValue)
                .average().orElse(0.0);
    }
}
