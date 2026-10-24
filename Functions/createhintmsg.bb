Function createhintmsg%(arg0$, arg1#, arg2%)
    If (T208Z6XX884 <> 0) Then
        Return $00
    EndIf
    If ((arg2 And (opt\Field3 = $00)) <> 0) Then
        Return $00
    EndIf
    msg\Field1 = arg0
    msg\Field3 = (70.0 * arg1)
    Return $00
End Function
