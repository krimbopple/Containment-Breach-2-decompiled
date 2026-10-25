Function GUESSEDupdatetxxf_2%(arg0%)
    Local local0.TX2BF6X0FF4
    MP_ResetConnection(GUESSEDgetglobal_9())
    If (GUESSEDupdateobjects_3(GUESSEDgetglobal_9(), arg0, $00) <> 0) Then
        For local0 = Each TX2BF6X0FF4
            blitz_TXXF80Z0FD00($09)
            GUESSEDcallcopybank(GUESSEDgetglobal_9(), $00)
            MP_Send(local0\Field7, local0\Field25, $03, $01, $01)
        Next
    EndIf
    Return $00
End Function
