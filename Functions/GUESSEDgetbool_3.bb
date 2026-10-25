Function GUESSEDgetbool_3#(arg0%, arg1#, arg2$)
    Local local0%
    local0 = _JsonGetValue(arg0, arg2)
    If (_JsonIsFloat(local0) <> 0) Then
        arg1 = _JsonGetFloat(local0)
    ElseIf (_JsonIsInt(local0) <> 0) Then
        arg1 = (Float _JsonGetInt(local0))
    ElseIf (_JsonIsBool(local0) <> 0) Then
        arg1 = (Float _JsonGetBool(local0))
    ElseIf (_JsonIsString(local0) <> 0) Then
        arg1 = (Float _JsonGetString(local0))
    EndIf
    Return arg1
    Return 0.0
End Function
