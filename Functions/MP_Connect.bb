Function MP_Connect%(arg0%, arg1%)
    If (MP_IsConnected() = $01) Then
        MP_Send(arg0, arg1, $00, $01, $00)
        Return $00
    EndIf
    _BN_Connect(F2648FXXF\Field13, arg0, arg1, F2648FXXF\Field0\Field3, F2648FXXF\Field0\Field2)
    MP_ResetConnection(F2648FXXF\Field0)
    Return $00
End Function
