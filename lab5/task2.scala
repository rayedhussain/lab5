package Lab5
import chisel3 . _
import chisel3 . util . _
 
   class DataPackets[ T <: Data ]( gen : T ) extends Bundle{
    val datapack = Input(gen)
    val addressfield = Input(UInt(10.W))
  }
 class Router [ T <: Data ]( gen : T ) extends Module {
    val io = IO(new Bundle{
        val in = Input(new DataPackets(gen))
        val out = Output(new DataPackets(gen))
        })
          io.out := io.in
   }