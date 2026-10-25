Function GUESSEDupdateentity_2%(arg0%)
    Local local0%
    Local local1.XF808F44XB
    Local local2.levers
    Local local3.X82B82400
    Local local4.TX2BF6X0FF4
    MP_ResetConnection(GUESSEDgetglobal_9())
    If (arg0 = $07) Then
        local0 = $00
        For local1 = Each XF808F44XB
            If (local1\Field7 <> 0) Then
                local0 = local1\Field0\Field27[local1\Field1]
                If (local0 <> $00) Then
                    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local1\Field0\Field1)
                    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local1\Field1)
                    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local1\Field5)
                    If (ReadBool(local1\Field5, $00) <> 0) Then
                        GUESSEDsetpoke_4(GUESSEDgetglobal_9(), entityx(local0, $01, 1.0))
                    EndIf
                    If (ReadBool(local1\Field5, $01) <> 0) Then
                        GUESSEDsetpoke_4(GUESSEDgetglobal_9(), entityy(local0, $01, 1.0))
                    EndIf
                    If (ReadBool(local1\Field5, $02) <> 0) Then
                        GUESSEDsetpoke_4(GUESSEDgetglobal_9(), entityz(local0, $01, 1.0))
                    EndIf
                    If (ReadBool(local1\Field5, $03) <> 0) Then
                        GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_4(entitypitch(local0, $01, 1.0), 10.0))
                    EndIf
                    If (ReadBool(local1\Field5, $04) <> 0) Then
                        GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_4(entityyaw(local0, $01, 1.0), 10.0))
                    EndIf
                    If (ReadBool(local1\Field5, $05) <> 0) Then
                        GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_4(entityroll(local0, $01, 1.0), 10.0))
                    EndIf
                EndIf
            EndIf
        Next
    Else
        For local3 = Each X82B82400
            If (local3\Field11 <> 0) Then
                local2 = local3\Field0\Field9[local3\Field1]
                If (local2 <> Null) Then
                    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local3\Field0\Field1)
                    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local3\Field1)
                    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), local3\Field6)
                    If (ReadBool(local3\Field6, $00) <> 0) Then
                        GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_4(entitypitch(local2\Field1, $01, 1.0), 10.0))
                    EndIf
                    If (ReadBool(local3\Field6, $01) <> 0) Then
                        GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_4(entityyaw(local2\Field1, $01, 1.0), 10.0))
                    EndIf
                    If (ReadBool(local3\Field6, $02) <> 0) Then
                        GUESSEDsetpoke(GUESSEDgetglobal_9(), GUESSEDcallclamp_4(entityroll(local2\Field1, $01, 1.0), 10.0))
                    EndIf
                EndIf
            EndIf
        Next
    EndIf
    GUESSEDsetpoke_3(GUESSEDgetglobal_9(), $00)
    For local4 = Each TX2BF6X0FF4
        If (local4\Field13 > $01) Then
            blitz_TXXF80Z0FD00($06)
            blitz_TXXF80Z0FD00(arg0)
            GUESSEDcallcopybank(GUESSEDgetglobal_9(), $00)
            MP_Send(local4\Field7, local4\Field25, $00, $01, $00)
        EndIf
    Next
    Return $00
End Function
