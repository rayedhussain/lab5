package lab5
import chisel3 . _
import chisel3 . util . _

class ex2 [ T <: Data ]( gen : T ) extends Module {
   
   val io=IO(new mybundle(gen))
    io . out := myfunc ( io . sel , io . in1 , io . in2 )

    def myfunc  [ T <: Data ](sel : Bool, in_0 :T , in_1 :T  ) : T = {
    Mux ( sel , in_1 , in_0 )
   }}
    class mybundle[ T <: Data ]( gen : T ) extends Bundle{
    val out = Output ( gen )
    val in1 = Input ( gen )
    val in2 = Input ( gen )
    val sel = Input ( Bool ())
    }