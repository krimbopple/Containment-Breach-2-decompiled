Function GUESSEDgetbool_2%(arg0%, arg1%, arg2$)
    Local local0%
    local0 = _JsonGetValue(arg0, arg2)
    If (_JsonIsInt(local0) <> 0) Then
        arg1 = _JsonGetInt(local0)
    ElseIf (_JsonIsFloat(local0) <> 0) Then
        arg1 = (Int _JsonGetFloat(local0))
    ElseIf (_JsonIsBool(local0) <> 0) Then
        arg1 = _JsonGetBool(local0)
    ElseIf (_JsonIsString(local0) <> 0) Then
        arg1 = (Int _JsonGetString(local0))
    EndIf
    Return arg1
    Return $00
End Function
