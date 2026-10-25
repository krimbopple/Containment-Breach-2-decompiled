Function LightColor%(arg0%, arg1%, arg2%, arg3%)
    Local local0.TX64X4ZXXX0
    local0 = GUESSEDsetlight(arg0)
    If (local0 <> Null) Then
        local0\Field5 = arg1
        local0\Field8 = arg2
        local0\Field4 = arg3
    EndIf
    Return $00
End Function
