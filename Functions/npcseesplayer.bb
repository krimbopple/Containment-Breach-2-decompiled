Function npcseesplayer%(arg0.npcs, arg1#, arg2#, arg3%)
    Local local0#
    Local local1%
    Local local2#
    Local local3%
    If ((i_268\Field3 Lor chs\Field8) <> 0) Then
        arg0\Field65 = 0.0
        Return $00
    EndIf
    local0 = entitydistancesquared(XZ0260X8X2\Field74, arg0\Field82)
    If (arg0\Field77 <> $18) Then
        If ((((arg1 * arg1) < local0) Lor (0.0 >= arg0\Field9)) <> 0) Then
            Return $00
        Else
            local1 = entityvisible(arg0\Field82, XZ0260X8X2\Field74, 0.0)
            local2 = (Abs deltayaw(arg0\Field82, XZ0260X8X2\Field74))
            If (1.0 < XZ0260X8X2\Field68) Then
                If (((arg2 < local2) And local1) <> 0) Then
                    Return $01
                ElseIf (local1 = $00) Then
                    If ((arg3 And XZ0260X8X2\Field25) <> 0) Then
                        Return $00
                    Else
                        Return $02
                    EndIf
                EndIf
            ElseIf (60.0 < local2) Then
                Return $00
            EndIf
            Return local1
        EndIf
    Else
        local3 = (XZ0260X8X2\Field72 * $03)
        If (local0 < ((((Float (playerroom\Field22\Field21 = $4C)) * 4.0) + arg1) * (((Float (playerroom\Field22\Field21 = $4C)) * 4.0) + arg1))) Then
            If (rnd(1.0, 1.5) < XZ0260X8X2\Field68) Then
                local3 = $02
            EndIf
            If ((entityvisible(arg0\Field82, XZ0260X8X2\Field74, 0.0) And (arg2 > (Abs deltayaw(arg0\Field82, XZ0260X8X2\Field74)))) <> 0) Then
                local3 = $01
            EndIf
        EndIf
        Return local3
    EndIf
    Return $00
End Function
