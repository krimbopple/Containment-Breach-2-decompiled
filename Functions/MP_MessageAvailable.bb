Function MP_MessageAvailable%()
    Local local0%
    Local local1%
    Local local2%
    Local local3$
    If (MP_IsConnected() = $01) Then
        If (_Steam_IsP2PPacketAvailable(local0) <> $00) Then
            local3 = MP_ReadP2PPacket(F2648FXXF\Field7)
            _Steam_GetUInt64(local3, local1, local2)
            F2648FXXF\Field12\Field1 = local1
            F2648FXXF\Field12\Field0 = local2
            F2648FXXF\Field12\Field2 = $00
            Return $01
        EndIf
        Return $00
    EndIf
    If (MP_ReceiveMessage(F2648FXXF\Field13, F2648FXXF\Field7) <> 0) Then
        F2648FXXF\Field12\Field1 = _BN_MsgIP(F2648FXXF\Field13)
        F2648FXXF\Field12\Field0 = _BN_MsgPort(F2648FXXF\Field13)
        If (_BN_MsgIsRaw(F2648FXXF\Field13) <> 0) Then
            F2648FXXF\Field12\Field2 = $02
        ElseIf (_BN_MsgIsSystem(F2648FXXF\Field13) <> 0) Then
            F2648FXXF\Field12\Field2 = $01
        Else
            F2648FXXF\Field12\Field2 = $00
        EndIf
        F2648FXXF\Field2 = (F2648FXXF\Field2 + F2648FXXF\Field7\Field2)
        Return $01
    EndIf
    Return $00
    Return $00
End Function
