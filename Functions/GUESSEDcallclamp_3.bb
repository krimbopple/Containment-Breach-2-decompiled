Function GUESSEDcallclamp_3#(arg0%, arg1%)
    Local local0%
    local0 = (Int (((Float arg0) * 1000.0) * 0.06))
    Return clamp(((Float arg1) / (Float local0)), 0.0, 1.0)
    Return 0.0
End Function
