package com.ibm.emeahrithu.fizzbuzz.web;

import com.ibm.emeahrithu.fizzbuzz.service.FizzBuzzService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
class FizzBuzzController {

    FizzBuzzService fizzBuzzService;

    @GetMapping("/element/{element}")
    String generateElement(@PathVariable("element") int element) {
        return fizzBuzzService.generateElement(element);
    }

    @GetMapping("/sequence/{limit}")
    List<String> generateSequence(@PathVariable("limit") int limit) {
        return fizzBuzzService.generateSequence(limit);
    }

}
