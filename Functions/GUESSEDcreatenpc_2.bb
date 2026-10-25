Function GUESSEDcreatenpc_2%(arg0%, arg1#)
    Local local0.TX64X4ZXXX0
    local0 = GUESSEDsetlight(arg0)
    If (local0 <> Null) Then
        local0\Field3 = arg1
    EndIf
    Return $00
End Function
