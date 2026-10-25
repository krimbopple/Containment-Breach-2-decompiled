Function GUESSEDsetentity_12%()
    Local local0.npcs
    Local local1%
    Local local2%
    Local local3.TX2BF6X0FF4
    MP_ResetConnection(GUESSEDgetglobal_9())
    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), chs\Field8)
    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), XZ0260X8X2\Field72)
    GUESSEDsetpoke_4(GUESSEDgetglobal_9(), mtftimer)
    If (n_i\Field11 <> Null) Then
        GUESSEDsetpoke_3(GUESSEDgetglobal_9(), n_i\Field11\Field56)
    Else
        GUESSEDsetpoke_3(GUESSEDgetglobal_9(), $00)
    EndIf
    If (n_i\Field13 <> Null) Then
        GUESSEDsetpoke_3(GUESSEDgetglobal_9(), n_i\Field13\Field56)
    Else
        GUESSEDsetpoke_3(GUESSEDgetglobal_9(), $00)
    EndIf
    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), i_035\Field0)
    For local0 = Each npcs
        If (local0\Field50 = $00) Then
            local1 = ((((((((local0\Field1 <> $00) + ((0.0 <> local0\Field66) Shl $01)) + ((0.0 <> local0\Field65) Shl $02)) + ((0.0 <> local0\Field57) Shl $03)) + ((0.0 <> local0\Field62) Shl $04)) + ((local0\Field59 <> Null) Shl $05)) + ((local0\Field75 <> $00) Shl $06)) + ((0.0 <> local0\Field31) Shl $07))
            local2 = (((((((((0.0 <> local0\Field60) Lor (0.0 <> local0\Field61)) Lor (0.0 <> local0\Field74)) + ((local0\Field29 > $00) Shl $01)) + ((local0\Field93 <> $00) Shl $02)) + ((local0\Field4 > $00) Shl $03)) + ((local0\Field78 <> $00) Shl $04)) + ((local0\Field22 <> $00) Shl $05)) + ((local0\Field79 = $01) Shl $06))
            GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local0\Field56)
            GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local0\Field77)
            GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local1)
            GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local2)
            If (0.0 <> local0\Field66) Then
                GUESSEDsetpoke_4(GUESSEDgetglobal_9(), local0\Field66)
            EndIf
            If (0.0 <> local0\Field65) Then
                GUESSEDsetpoke_4(GUESSEDgetglobal_9(), local0\Field65)
            EndIf
            If (0.0 <> local0\Field57) Then
                GUESSEDsetpoke_4(GUESSEDgetglobal_9(), local0\Field57)
            EndIf
            If (0.0 <> local0\Field62) Then
                GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_4(local0\Field62, 10.0))
            EndIf
            If (local0\Field59 <> Null) Then
                GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local0\Field59\Field56)
            EndIf
            If (local0\Field75 <> $00) Then
                GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local0\Field75)
                GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local0\Field89)
            EndIf
            If (0.0 <> local0\Field31) Then
                GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_4(local0\Field31, 10.0))
            EndIf
            If (ReadBool(local2, $00) <> 0) Then
                GUESSEDsetpoke_4(GUESSEDgetglobal_9(), local0\Field60)
                GUESSEDsetpoke_4(GUESSEDgetglobal_9(), local0\Field61)
                GUESSEDsetpoke_4(GUESSEDgetglobal_9(), local0\Field74)
            EndIf
            GUESSEDsetpoke_4(GUESSEDgetglobal_9(), entityx(local0\Field82, $01, 1.0))
            GUESSEDsetpoke_4(GUESSEDgetglobal_9(), entityy(local0\Field82, $01, 1.0))
            GUESSEDsetpoke_4(GUESSEDgetglobal_9(), entityz(local0\Field82, $01, 1.0))
            GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_4(entityyaw(local0\Field82, $01, 1.0), 10.0))
            GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_4(entityyaw(local0\Field98, $01, 1.0), 10.0))
            GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_8(max(animtime(local0\Field98), 0.0), 10.0))
            GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_8(local0\Field54, 10.0))
            GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_8(local0\Field16, 10.0))
            GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_4(local0\Field52, 100.0))
            GUESSEDsetpoke(GUESSEDgetglobal_9(), (Int local0\Field34))
            If (local0\Field29 > $00) Then
                GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local0\Field29)
            EndIf
            If (local0\Field4 > $00) Then
                GUESSEDsetpoke(GUESSEDgetglobal_9(), local0\Field4)
            EndIf
        EndIf
    Next
    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), $00)
    For local3 = Each TX2BF6X0FF4
        If (local3\Field13 > $01) Then
            blitz_TXXF80Z0FD00($06)
            blitz_TXXF80Z0FD00($03)
            GUESSEDcallcopybank(GUESSEDgetglobal_9(), $00)
            MP_Send(local3\Field7, local3\Field25, $00, $01, $00)
        EndIf
    Next
    Return $00
End Function
