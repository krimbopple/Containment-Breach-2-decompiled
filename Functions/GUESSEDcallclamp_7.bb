Function GUESSEDcallclamp_7%(arg0#, arg1#)
    Return (Int ((clamp(arg0, (-127.0 / arg1), (128.0 / arg1)) * arg1) + 127.0))
    Return $00
End Function
