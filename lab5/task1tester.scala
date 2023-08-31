package lab5
import org.scalatest._
import chisel3._
import chisel3.util._
import chiseltest._

 class task1tester extends FreeSpec with ChiselScalatestTester{
    "task1lab5" in {
         test(new task1(6))  { a=>
       
         a.io.in0.poke(1.U)
         a.io.in1.poke(2.U)
         a.clock.step(1)
         a.io.sum.expect(3.U)
           
         }}}