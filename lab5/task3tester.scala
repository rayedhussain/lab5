// package Lab5

// import chisel3._
// import chisel3.util._
// import org.scalatest.FreeSpec
// import chisel3.tester._
// import chiseltest.experimental.TestOptionBuilder._
// import chiseltest.internal.VerilatorBackendAnnotation
// import scala.util.Random
// import chisel3.experimental.BundleLiterals._

// class task3tester  extends FreeSpec with ChiselScalatestTester {
//     " eMuxCast test" in {
//     test(new eMuxCast(4.)) { a =>
//     a.io.input1.poke(5.U)
//     a.io.input2.poke(0.B)
//     a.io.sel.poke(1.B)
//     a.clock.step(1)
//     a.io.output.expect(0.S)
// }}}