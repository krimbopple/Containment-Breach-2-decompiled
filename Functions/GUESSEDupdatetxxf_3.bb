Function GUESSEDupdatetxxf_3%(arg0.TX2BF6X0FF4, arg1$, arg2%)
    Local local0.TX2BF6X0FF4
    For local0 = Each TX2BF6X0FF4
        If (((local0\Field13 > $01) And (arg0 <> local0)) <> 0) Then
            blitz_TXXF80Z0FD00($13)
            blitz_ZXBBD60DX0(arg1)
            blitz_TXXF80Z0FD00($00)
            MP_Send(local0\Field7, local0\Field25, $03, $01, $02)
        EndIf
    Next
    Return $00
End Function
