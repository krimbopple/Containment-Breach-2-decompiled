Function MP_SendMessage%(arg0%, arg1%, arg2%, arg3%, arg4%)
    If (MP_IsConnected() = $01) Then
        _Steam_SendP2PPacket(_Steam_GetUInt64String(arg0, arg1), F2648FXXF\Field0\Field3, F2648FXXF\Field0\Field2, $02)
        MP_ResetConnection(F2648FXXF\Field0)
        Return $00
    EndIf
    _BN_SendMsg(F2648FXXF\Field13, arg0, arg1, F2648FXXF\Field0\Field3, F2648FXXF\Field0\Field2, arg4, arg2, arg3)
    MP_ResetConnection(F2648FXXF\Field0)
    Return $00
End Function
