Function ADF2ZD642%()
    Local local0%
    Local local2%
    Local local3$
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    If (((X40BZ0ZDD8\Field2 <> TXF66X8D2Z6()) Lor (X40BZ0ZDD8\Field1 <> X4DX24D446())) <> 0) Then
        Return $00
    EndIf
    local0 = blitz_TX28D20DD080()
    If (T44Z882FFD() = $01) Then
        Select local0
            Case $15
                local2 = blitz_TX28D20DD080()
                local3 = blitz_T2X820D0FD0()
                XZ24ZD260F(local2, local3, $01)
            Case $16
                XZ24ZD260F($04, "", $01)
            Case $11
                XZ24ZD260F($04, "", $01)
        End Select
        Return $00
    EndIf
    local4 = local0
    If (local4 = $02) Then
        local5 = blitz_TX28D20DD080()
        local6 = blitz_TX28D20DD080()
        local7 = blitz_TX28D20DD080()
        TXZ6XX886DD(local5, "")
        If (local5 <> $00) Then
            XZ24ZD260F(local5, "", $01)
            Return $00
        EndIf
        If (local6 > $00) Then
            If (mainmenuopen = $00) Then
                TX40FB0F424(X40BZ0ZDD8\Field2, X40BZ0ZDD8\Field1)
                TXDFXDZXXDD\Field7 = local6
                XXDDBX88Z8()
                Z4BXB60F0()
                X40BZ0ZDD8\Field2 = $00
                X40BZ0ZDD8\Field1 = $00
                T20X84XZFZ0()
            Else
                XZ24ZD260F($0D, "", $00)
            EndIf
        ElseIf (local7 <> 0) Then
            If (mainmenuopen = $00) Then
                T2F4ZB48XD($00, $00, local7)
            Else
                XZ24ZD260F($0D, "", $00)
            EndIf
        Else
            T2F4ZB48XD(X40BZ0ZDD8\Field2, X40BZ0ZDD8\Field1, $00)
        EndIf
        Return $01
    EndIf
    Return $00
    Return $00
End Function
