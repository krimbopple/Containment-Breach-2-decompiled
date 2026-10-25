Function MP_CreateStream%(arg0%, arg1%, arg2%)
    Local local0%
    local0 = _BN_CreateStream(arg0, arg1)
    If (local0 <> 0) Then
        _BN_SetStreamOptions(local0, $80000, $00, arg2)
    EndIf
    Return local0
    Return $00
End Function
