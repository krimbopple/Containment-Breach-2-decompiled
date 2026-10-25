Function GUESSEDupdatetxxf_5%()
    Local local0.TX2BF6X0FF4
    GUESSEDupdateobjects_21()
    For local0 = Each TX2BF6X0FF4
        If (local0\Field13 > $01) Then
            blitz_TXXF80Z0FD00($05)
            GUESSEDcallcopybank(GUESSEDgetglobal_9(), $00)
            GUESSEDddfunc(local0)
            MP_Send(local0\Field7, local0\Field25, $00, $01, $00)
        EndIf
    Next
    Return $00
End Function
