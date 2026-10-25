Function GUESSEDsetentity_7%(arg0%)
    Local local0.TX2BF6X0FF4
    Local local1%
    Local local2.items
    Local local3.T24B4ZF6F6
    Local local4%
    local0 = TXXF6F02DB2[GUESSEDupdatedropitem()]
    If (local0 <> Null) Then
        If (playerroom <> Null) Then
            local0\Field3 = playerroom\Field1
        EndIf
        If (((0.0 >= FD020X0BZ\Field2) Lor arg0) <> 0) Then
            local0\Field19 = entityx(XZ0260X8X2\Field74, $00, 1.0)
            local0\Field49 = entityy(XZ0260X8X2\Field74, $00, 1.0)
            local0\Field26 = entityz(XZ0260X8X2\Field74, $00, 1.0)
            local0\Field36 = entitypitch(camera, $00, 1.0)
            local0\Field1 = entityyaw(camera, $00, 1.0)
            local0\Field45 = XZ0260X8X2\Field68
            local0\Field53 = $00
            local1 = $00
            If (selecteditem <> Null) Then
                local0\Field53 = selecteditem\Field27
            ElseIf (GUESSEDrenderitems() <> Null) Then
                local2 = GUESSEDrenderitems()
                local3 = GUESSEDrenderrendergui_4(local2\Field6\Field11)
                If (((local3 <> Null) And local3\Field3\Field9) <> 0) Then
                    local0\Field53 = local2\Field27
                    local1 = $01
                EndIf
            EndIf
            local0\Field30 = (((-16.0 < XZ0260X8X2\Field53) And (-6.0 > XZ0260X8X2\Field53)) Lor T8660BZ460\Field5)
            local0\Field29 = DZ64X028\Field1
            local0\Field37 = XZ0260X8X2\Field25
            local0\Field44\Field9 = (128.0 < DZ64X028\Field22)
            For local4 = $00 To $05 Step $01
                If ((((TXDFXDZXXDD\Field16[local4] <> $00) And (TXDFXDZXXDD\Field16[local4] = local0\Field53)) And (local1 = $00)) <> 0) Then
                    local0\Field53 = $00
                    Exit
                EndIf
            Next
        EndIf
    EndIf
    Return $00
End Function
