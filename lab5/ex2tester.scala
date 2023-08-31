package lab5
import org.scalatest._
import chisel3._
import chisel3.util._
import chiseltest._
 class ex2tester extends FreeSpec with ChiselScalatestTester{
    "ex2lab5" in {
         test(new ex2(UInt(5.W))){ a=>
         a.io.in1.poke(1.U)
         a.io.in2.poke(2.U)
         a.io.sel.poke(false.B)
         a.clock.step(20)
         a.io.out.expect(1.U)
           
         }}}