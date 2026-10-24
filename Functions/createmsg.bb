Function createmsg%(arg0$, arg1#)
    If (T208Z6XX884 <> 0) Then
        Return $00
    EndIf
    msg\Field0 = arg0
    msg\Field2 = (70.0 * arg1)
    Return $00
End Function
