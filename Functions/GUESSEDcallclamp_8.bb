Function GUESSEDcallclamp_8%(arg0#, arg1#)
    Return (Int (clamp(arg0, 0.0, (65535.0 / arg1)) * arg1))
    Return $00
End Function
