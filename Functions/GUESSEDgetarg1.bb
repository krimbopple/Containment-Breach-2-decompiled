Function GUESSEDgetarg1$(arg0%, arg1$, arg2$)
    Local local0%
    local0 = _JsonGetValue(arg0, arg2)
    If (_JsonIsString(local0) <> 0) Then
        arg1 = _JsonGetString(local0)
    EndIf
    Return arg1
    Return ""
End Function
