Function GUESSEDsetfd%()
    Local local0%
    Local local2%
    Local local3$
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    If (((X40BZ0ZDD8\Field2 <> GUESSEDgetglobal_11()) Lor (X40BZ0ZDD8\Field1 <> GUESSEDgetglobal_15())) <> 0) Then
        Return $00
    EndIf
    local0 = blitz_TX28D20DD080()
    If (GUESSEDgetglobal_4() = $01) Then
        Select local0
            Case $15
                local2 = blitz_TX28D20DD080()
                local3 = blitz_T2X820D0FD0()
                GUESSEDinitinitnewgame_7(local2, local3, $01)
            Case $16
                GUESSEDinitinitnewgame_7($04, "", $01)
            Case $11
                GUESSEDinitinitnewgame_7($04, "", $01)
        End Select
        Return $00
    EndIf
    local4 = local0
    If (local4 = $02) Then
        local5 = blitz_TX28D20DD080()
        local6 = blitz_TX28D20DD080()
        local7 = blitz_TX28D20DD080()
        GUESSEDcheckvalue_27(local5, "")
        If (local5 <> $00) Then
            GUESSEDinitinitnewgame_7(local5, "", $01)
            Return $00
        EndIf
        If (local6 > $00) Then
            If (mainmenuopen = $00) Then
                GUESSEDsetglobal_13(X40BZ0ZDD8\Field2, X40BZ0ZDD8\Field1)
                TXDFXDZXXDD\Field7 = local6
                GUESSEDpositiontform()
                GUESSEDsettx_4()
                X40BZ0ZDD8\Field2 = $00
                X40BZ0ZDD8\Field1 = $00
                GUESSEDsetglobal_10()
            Else
                GUESSEDinitinitnewgame_7($0D, "", $00)
            EndIf
        ElseIf (local7 <> 0) Then
            If (mainmenuopen = $00) Then
                MP_UpdateJoinQueue($00, $00, local7)
            Else
                GUESSEDinitinitnewgame_7($0D, "", $00)
            EndIf
        Else
            MP_UpdateJoinQueue(X40BZ0ZDD8\Field2, X40BZ0ZDD8\Field1, $00)
        EndIf
        Return $01
    EndIf
    Return $00
    Return $00
End Function
