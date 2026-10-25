Function MP_Disconnect%(arg0%, arg1%, arg2%)
    If (arg2 <> 0) Then
        _BN_CloseConnection(F2648FXXF\Field13, arg0, arg1, F2648FXXF\Field0\Field3, F2648FXXF\Field0\Field2)
        MP_ResetConnection(F2648FXXF\Field0)
        Return $00
    EndIf
    _BN_CloseConnection(F2648FXXF\Field13, arg0, arg1, F2648FXXF\Field0\Field3, $00)
    Return $00
End Function
