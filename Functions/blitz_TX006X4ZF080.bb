Function blitz_TX006X4ZF080#(arg0#, arg1#, arg2#, arg3#)
    Local local0#
    If (arg1 > arg0) Then
        arg2 = (- arg2)
    EndIf
    local0 = ((arg2 * arg3) + arg1)
    If (arg1 > arg0) Then
        Return max(local0, arg0)
    Else
        Return min(local0, arg0)
    EndIf
    Return 0.0
End Function
