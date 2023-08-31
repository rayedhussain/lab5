package lab5
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class ex1tester extends FreeSpec with ChiselScalatestTester{
    "chisel tester file " in {
        test(new EX1(4)){a=>
        
        a.io.arg_x.poke(3.U)
        a.io.arg_y.poke(3.U)
        a.io.alu_oper.poke("b0010".U)
        a.io.alu_out.expect(6.U)
         a.clock.step(10)
        }
    }
}
