package com.kube.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.util.*
import java.util.concurrent.atomic.AtomicInteger

@RestController
class DemoController {

    var counter: AtomicInteger = AtomicInteger(0)

    @GetMapping("create/{name}")
    fun createName(@PathVariable name: String): Mono<Register> {
        val uuid = UUID.randomUUID()
        val register = Register(counter.incrementAndGet(), "$name - $uuid")
        return Mono.just(register)
    }
}