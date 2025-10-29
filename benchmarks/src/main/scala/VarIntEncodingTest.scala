package org.lichess.compression.benchmark

import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.Blackhole

import java.util.concurrent.TimeUnit

import org.lichess.compression.VarIntEncoder
import org.lichess.compression.{ BitReader as Reader, BitWriter as Writer }

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class VarIntEncodingTest extends EncodingTestData:

  @Benchmark
  def testEncode(blackhole: Blackhole) =
    val writer = new Writer
    VarIntEncoder.writeSigned(encodedRounds, writer)
    blackhole.consume(writer.toArray())

  @Benchmark
  def testDecode(blackhole: Blackhole) =
    blackhole.consume(VarIntEncoder.readSigned(new Reader(encoded), moves))
