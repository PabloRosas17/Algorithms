
package benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class DriverJavaBenchmark {

    private static final String JVM_INITIAL_MEMORY = "-Xms4g";
    private static final String JVM_MAXIMUM_MEMORY = "-Xmx4g";
    private static final int BENCHMARK_ITERATIONS = 0x03;
    private static final int BENCHMARK_TIME = 0x05;
    private static final int BENCHMARK_FORK = 0x01;
    private static final String BENCHMARK_OUTPUT = "benchmark_sequence.log";
    private static final String BENCHMARK_REGEX = ".*";
    private static final String BENCHMARK_IO = "DriverJavaBenchmark.java,FireBenchmark,benchmark()";

    public static class FireJavaBenchmark {
        @Benchmark
        @Warmup(iterations = BENCHMARK_ITERATIONS, time = BENCHMARK_TIME, timeUnit = MILLISECONDS)
        @Fork(BENCHMARK_FORK)
        public void benchmark(){System.out.println(BENCHMARK_IO);}
    }

    public static void main(String[] args) throws RunnerException {
        Options opts = new OptionsBuilder()
                .include(BENCHMARK_REGEX)
                .warmupIterations(BENCHMARK_ITERATIONS)
                .warmupTime(TimeValue.seconds(BENCHMARK_TIME))
                .jvmArgs(JVM_INITIAL_MEMORY,JVM_MAXIMUM_MEMORY)
                .shouldDoGC(true)
                .output(BENCHMARK_OUTPUT)
                .forks(BENCHMARK_FORK)
                .build();
        new Runner(opts).run();
    }
}
