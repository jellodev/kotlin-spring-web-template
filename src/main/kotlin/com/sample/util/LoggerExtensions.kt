package com.sample.util
import io.github.oshai.kotlinlogging.KLogger
import io.github.oshai.kotlinlogging.KotlinLogging

/**
 * 모든 Kotlin 클래스에서 로거(Logger)를 쉽게 사용할 수 있도록 돕는 확장 속성
 *
 * `companion object` 같은 반복적인 로거 선언 코드 사용 안해도 됨
 *  KotlinLogging의 지연 평가 (lazy evaluation) 을 활용하여 실제 로그 메시지가 필요한 시점에 메시지를 만듬
 */
val Any.logger: KLogger
    get() = KotlinLogging.logger(this.javaClass.enclosingClass?.name ?: this.javaClass.name)
