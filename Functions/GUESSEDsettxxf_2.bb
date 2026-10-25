Function GUESSEDsettxxf_2%()
    Local local0.events
    Local local1.TX2BF6X0FF4
    MP_ResetConnection(GUESSEDgetglobal_9())
    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), soundtransmission)
    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), remotedooron)
    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), (XZ0260X8X2\Field40 + $01))
    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), ((Int XZ0260X8X2\Field48) And (XZ0260X8X2\Field40 <> $FFFFFFFF)))
    For local0 = Each events
        If (local0\Field6 = $00) Then
            GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local0\Field25)
            GUESSEDsetpoke_3(GUESSEDgetglobal_9(), ((((0.0 <> local0\Field4) + ((0.0 <> local0\Field7) Shl $01)) + ((0.0 <> local0\Field1) Shl $02)) + (GUESSEDcallupdatedropitem(local0) Shl $03)))
            If (0.0 <> local0\Field4) Then
                GUESSEDsetpoke_4(GUESSEDgetglobal_9(), local0\Field4)
            EndIf
            If (0.0 <> local0\Field7) Then
                GUESSEDsetpoke_4(GUESSEDgetglobal_9(), local0\Field7)
            EndIf
            If (0.0 <> local0\Field1) Then
                GUESSEDsetpoke_4(GUESSEDgetglobal_9(), local0\Field1)
            EndIf
        EndIf
    Next
    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), $00)
    For local1 = Each TX2BF6X0FF4
        If (local1\Field13 > $01) Then
            blitz_TXXF80Z0FD00($06)
            blitz_TXXF80Z0FD00($04)
            GUESSEDcallcopybank(GUESSEDgetglobal_9(), $00)
            MP_Send(local1\Field7, local1\Field25, $00, $01, $00)
        EndIf
    Next
    Return $00
End Function
