Function TXX2F60Z0XB#(arg0#, arg1#, arg2#, arg3#)
    Local local0#
    local0 = (((arg0 - arg1) * ((1.0 / arg2) * arg3)) + arg1)
    If (arg1 > arg0) Then
        Return max(local0, arg0)
    Else
        Return min(local0, arg0)
    EndIf
    Return 0.0
End Function
