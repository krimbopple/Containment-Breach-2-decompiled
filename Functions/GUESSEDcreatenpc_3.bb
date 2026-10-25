Function GUESSEDcreatenpc_3%(arg0%, arg1%)
    Local local0.TX64X4ZXXX0
    local0 = GUESSEDsetlight(arg0)
    If (local0 <> Null) Then
        local0\Field10 = arg1
    EndIf
    Return $00
End Function
