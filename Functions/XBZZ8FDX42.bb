Function XBZZ8FDX42#(arg0#, arg1#, arg2%)
    Local local0%
    Local local1#
    local0 = rndseed()
    seedrnd(arg2)
    local1 = rnd(arg0, arg1)
    seedrnd(local0)
    Return local1
    Return 0.0
End Function
