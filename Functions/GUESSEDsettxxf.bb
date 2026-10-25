Function GUESSEDsettxxf%()
    Local local0%
    Local local1.TX2BF6X0FF4
    local0 = GUESSEDupdateitems_2()
    For local1 = Each TX2BF6X0FF4
        If (((local1\Field13 > $01) And (local0 > local1\Field46\Field4)) <> 0) Then
            local1\Field46\Field32 = local0
            local1\Field46\Field4 = (local0 + $3E8)
            blitz_TXXF80Z0FD00($15)
            MP_Send(local1\Field7, local1\Field25, $00, $01, $00)
        EndIf
    Next
    Return $00
End Function
