Function IsEntityInRoom%(arg0.rooms, arg1%, arg2%)
    Local local0%
    local0 = arg0\Field31
    If (arg2 <> 0) Then
        local0 = arg0\Field12
    EndIf
    Return blitz_F24F084XB0(arg1, local0)
    Return $00
End Function
