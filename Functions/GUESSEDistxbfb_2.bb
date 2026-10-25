Function GUESSEDistxbfb_2%()
    Local local0.TX2BF6X0FF4
    Local local1.T6068XB4Z2
    For local0 = Each TX2BF6X0FF4
        If (local0\Field13 > $01) Then
            blitz_TXXF80Z0FD00($06)
            blitz_TXXF80Z0FD00($0A)
            GUESSEDupdateobjects_5(local0\Field13, $05)
            For local1 = Each T6068XB4Z2
                local1\Field8 = (5000.0 > entitydistancesquared(local1\Field31, local0\Field52))
                If (local1\Field8 <> 0) Then
                    If (GUESSEDcheckvalue_14(local0\Field13, $05, local1\Field30, local1\Field3) <> 0) Then
                        GUESSEDddfunc_2(local1)
                    EndIf
                Else
                    GUESSEDremovemapentry(local0\Field13, $05, local1\Field30, $00)
                EndIf
            Next
            If (GUESSEDgetfielddifference(GUESSEDgetglobal_2()) > $02) Then
                blitz_TXBFB002B8X0($00)
                MP_Send(local0\Field7, local0\Field25, $03, $02, $08)
            Else
                GUESSEDcallsetfield()
            EndIf
            blitz_TXXF80Z0FD00($06)
            blitz_TXXF80Z0FD00($0A)
            For local1 = Each T6068XB4Z2
                If (local1\Field8 <> 0) Then
                    GUESSEDgetentity_4(local1)
                EndIf
            Next
            If (GUESSEDgetfielddifference(GUESSEDgetglobal_2()) > $02) Then
                blitz_TXBFB002B8X0($00)
                MP_Send(local0\Field7, local0\Field25, $00, $02, $00)
            Else
                GUESSEDcallsetfield()
            EndIf
        EndIf
    Next
    GUESSEDupdateobjects_6($05)
    Return $00
End Function
