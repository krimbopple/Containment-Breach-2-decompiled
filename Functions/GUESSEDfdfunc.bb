Function GUESSEDfdfunc%()
    Local local0%
    Local local2%
    Local local3$
    If (((GUESSEDgetglobal_11() <> GUESSEDinitinitnewgame_8()) Lor (GUESSEDgetglobal_15() <> GUESSEDgetglobal_19())) <> 0) Then
        Return $00
    EndIf
    local0 = blitz_TX28D20DD080()
    If (GUESSEDgetglobal_4() = $01) Then
        Select local0
            Case $16
                GUESSEDinitinitnewgame_7($04, "", $01)
            Case $15
                local2 = blitz_TX28D20DD080()
                local3 = blitz_T2X820D0FD0()
                GUESSEDinitinitnewgame_7(local2, local3, $01)
        End Select
        Return $00
    EndIf
    If (TXZ840ZF420[local0] <> $00) Then
        
    EndIf
    Return $00
End Function
