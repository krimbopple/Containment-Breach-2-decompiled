Function GUESSEDupdateobjects_21%()
    Local local0.TX2BF6X0FF4
    MP_ResetConnection(GUESSEDgetglobal_9())
    For local0 = Each TX2BF6X0FF4
        local0\Field18 = ((((((local0\Field30 + (local0\Field44\Field9 Shl $01)) + ((2.0 <= local0\Field45) Shl $02)) + (local0\Field12 Shl $03)) + ((local0\Field53 <> $00) Shl $04)) + ((local0\Field48 = $01) Shl $05)) + (((local0\Field48 = $02) Shl $06) + (local0\Field37 Shl $07)))
        GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local0\Field13)
        GUESSEDsetpoke_3(GUESSEDgetglobal_9(), $01)
        GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local0\Field18)
        GUESSEDsetpoke_4(GUESSEDgetglobal_9(), local0\Field19)
        GUESSEDsetpoke_4(GUESSEDgetglobal_9(), local0\Field49)
        GUESSEDsetpoke_4(GUESSEDgetglobal_9(), local0\Field26)
        GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_4(local0\Field36, 100.0))
        GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_4(local0\Field1, 100.0))
        GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local0\Field20)
        GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local0\Field3)
        GUESSEDsetpoke(GUESSEDgetglobal_9(), local0\Field44\Field7)
        If (local0\Field53 <> $00) Then
            GUESSEDsetpoke_2(GUESSEDgetglobal_9(), local0\Field53)
        EndIf
    Next
    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), $00)
    Return $00
End Function
