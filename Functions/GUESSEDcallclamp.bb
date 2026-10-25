Function GUESSEDcallclamp%(arg0#, arg1#)
    Return (Int (clamp(arg0, 0.0, (255.0 / arg1)) * arg1))
    Return $00
End Function
