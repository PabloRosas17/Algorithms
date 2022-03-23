
package benchmark

import benchmark.BenchmarkDefines.BENCHMARK_FORK
import benchmark.BenchmarkDefines.BENCHMARK_IO
import benchmark.BenchmarkDefines.BENCHMARK_ITERATIONS
import benchmark.BenchmarkDefines.BENCHMARK_OUTPUT
import benchmark.BenchmarkDefines.BENCHMARK_REGEX
import benchmark.BenchmarkDefines.JVM_INITIAL_MEMORY
import benchmark.BenchmarkDefines.JVM_MAXIMUM_MEMORY
import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.runner.Runner
import org.openjdk.jmh.runner.options.OptionsBuilder
import java.util.concurrent.TimeUnit

open class DriverKotlinBenchmark{

    @BenchmarkMode(Mode.Throughput)
    @Warmup(iterations = 0x03, time = 0x05, timeUnit = TimeUnit.MILLISECONDS)
    @Fork(0x01)
    open inner class FireKotlinBenchmark {
        @Benchmark
        fun benchmark(){ println(BENCHMARK_IO) }
    }
}

fun main(args: Array<String>){
    val options = OptionsBuilder()
        .include(BENCHMARK_REGEX)
        .warmupIterations(BENCHMARK_ITERATIONS)
        .jvmArgs(JVM_INITIAL_MEMORY,JVM_MAXIMUM_MEMORY)
        .shouldDoGC(true)
        .output(BENCHMARK_OUTPUT)
        .forks(BENCHMARK_FORK)
        .build()
    Runner(options).run()
}

object BenchmarkDefines {
    const val JVM_INITIAL_MEMORY = "-Xms4g"
    const val JVM_MAXIMUM_MEMORY = "-Xmx4g"
    const val BENCHMARK_ITERATIONS = 0x03
    const val BENCHMARK_TIME = 0x05
    const val BENCHMARK_FORK = 0x01
    const val BENCHMARK_OUTPUT = "benchmark_sequence.log"
    const val BENCHMARK_REGEX = ".*"
    const val BENCHMARK_IO = "DriverKotlinBenchmark.kt,FireBenchmark,benchmark()"
}
