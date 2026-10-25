Function GUESSEDisentity_3%()
    Local local0.items
    Local local1.TX2BF6X0FF4
    Local local2%
    For local0 = Each items
        If (local0\Field27 = $00) Then
            removeitem(local0, $01)
        Else
            local0\Field22 = $00
            local0\Field7 = GUESSEDsetfield(local0, $00)
            If (local0\Field29 = $00) Then
                If ((((isequal(entityx(local0\Field9, $00, 1.0), local0\Field43, 0.01) = $00) Lor (isequal(entityy(local0\Field9, $00, 1.0), local0\Field4, 0.01) = $00)) Lor (isequal(entityz(local0\Field9, $00, 1.0), local0\Field37, 0.01) = $00)) <> 0) Then
                    local0\Field22 = $01
                    local0\Field43 = entityx(local0\Field9, $00, 1.0)
                    local0\Field4 = entityy(local0\Field9, $00, 1.0)
                    local0\Field37 = entityz(local0\Field9, $00, 1.0)
                EndIf
            EndIf
        EndIf
    Next
    For local1 = Each TX2BF6X0FF4
        If (local1\Field13 > $01) Then
            local1\Field5 = $00
            blitz_TXXF80Z0FD00($06)
            blitz_TXXF80Z0FD00($02)
            GUESSEDupdateobjects_5(local1\Field13, $00)
            For local0 = Each items
                local2 = (local0\Field29 = local1\Field13)
                local0\Field45 = (local2 Lor ((250.0 > entitydistancesquared(local1\Field52, local0\Field9)) And ((local0\Field17 = $00) Lor local0\Field33)))
                If (((local2 And (local0\Field18 = $00)) And (local1\Field5 < maxitemamount)) <> 0) Then
                    local1\Field5 = (local1\Field5 + $01)
                EndIf
                If (local0\Field45 <> 0) Then
                    If (GUESSEDcheckvalue_14(local1\Field13, $00, local0\Field27, local0\Field7) <> 0) Then
                        GUESSEDsetanim_3(local0, local1)
                        GUESSEDgetentity_9(local0)
                    EndIf
                Else
                    GUESSEDremovemapentry(local1\Field13, $00, local0\Field27, $FFFFFFFF)
                EndIf
            Next
            If (GUESSEDgetfielddifference(GUESSEDgetglobal_2()) > $02) Then
                blitz_TXBFB002B8X0($00)
                MP_Send(local1\Field7, local1\Field25, $03, $01, $03)
            Else
                GUESSEDcallsetfield()
            EndIf
            blitz_TXXF80Z0FD00($06)
            blitz_TXXF80Z0FD00($02)
            For local0 = Each items
                If ((local0\Field22 And local0\Field45) <> 0) Then
                    GUESSEDgetentity_9(local0)
                EndIf
            Next
            If (GUESSEDgetfielddifference(GUESSEDgetglobal_2()) > $02) Then
                blitz_TXBFB002B8X0($00)
                MP_Send(local1\Field7, local1\Field25, $00, $02, $00)
            Else
                GUESSEDcallsetfield()
            EndIf
        EndIf
    Next
    GUESSEDupdateobjects_6($00)
    Return $00
End Function
