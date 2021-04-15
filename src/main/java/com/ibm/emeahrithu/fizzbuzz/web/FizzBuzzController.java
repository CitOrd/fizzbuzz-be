package com.ibm.emeahrithu.fizzbuzz.web;

import com.ibm.emeahrithu.fizzbuzz.service.FizzBuzzService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sequence")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
class FizzBuzzController {

    FizzBuzzService fizzBuzzService;

    @GetMapping("/{limit}")
    List<String> generateSequence(@PathVariable("limit") int limit) {
        return fizzBuzzService.generateSequence(limit);
    }

}
