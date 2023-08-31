package Lab5
import chisel3 . _
import chisel3 . util . _


class eMuxCast(Width : Int) extends Module{
    val io = IO(new Bundle{
    val input1 = Input(UInt(Width.W))
    val input2 = Input(Bool())
    val sel = Input(Bool())
    val output = Output(SInt(Width.W))
    })
    io.output := Mux(io.sel, io.input2, io.input1).asSInt
}