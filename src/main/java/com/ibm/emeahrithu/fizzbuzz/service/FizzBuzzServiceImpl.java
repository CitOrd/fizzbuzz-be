package com.ibm.emeahrithu.fizzbuzz.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
class FizzBuzzServiceImpl implements FizzBuzzService {

    @Override
    public List<String> generateSequence(int limit) {
        return IntStream.rangeClosed(1, limit)
                .mapToObj(this::convertElement)
                .collect(Collectors.toList());
    }

    private String convertElement(int element) {
        boolean divisibleBy3 = element % 3 == 0;
        boolean divisibleBy5 = element % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {
            return "FizzBuzz";
        }

        if (divisibleBy3) {
            return "Fizz";
        }

        if (divisibleBy5) {
            return "Buzz";
        }

        return String.valueOf(element);
    }

}
