Function updatecredits%()
    Local local0.creditsline
    Local local1.creditsline
    Local local2#
    Local local3%
    Local local4%
    local2 = (((XZ0260X8X2\Field2 + 2000.0) / 2.0) + ((Float opt\Field46) + 10.0))
    local3 = $00
    local4 = $00
    local1 = Null
    For local0 = Each creditsline
        local0\Field1 = local3
        If (left(local0\Field2, $01) = "/") Then
            local1 = (Before local0)
        EndIf
        If (local1 <> Null) Then
            local0\Field0 = (local0\Field1 > local1\Field1)
        EndIf
        If (local0\Field0 <> 0) Then
            local4 = (local4 + $01)
        EndIf
        local3 = (local3 + $01)
    Next
    If ((Float (- stringheight(local1\Field2))) > (((Float (local1\Field1 * $18)) * menuscale) + local2)) Then
        XZ0260X8X2\Field50 = (XZ0260X8X2\Field50 + (fps\Field3[$01] * 0.5))
        If (0.0 <= XZ0260X8X2\Field50) Then
            If (1600.0 < XZ0260X8X2\Field50) Then
                XZ0260X8X2\Field50 = -255.0
            EndIf
        ElseIf (-1.0 <= XZ0260X8X2\Field50) Then
            XZ0260X8X2\Field50 = -1.0
        EndIf
    EndIf
    If (((getkey() <> $00) Lor mousehit($01)) <> 0) Then
        XZ0260X8X2\Field50 = -1.0
    EndIf
    If (-1.0 = XZ0260X8X2\Field50) Then
        BXZ2846Z2()
        Delete Each creditsline
        nullgame($00)
        stopstream_strict(musicchn)
        musicchn = $00
        shouldplay = $14
        currsave = Null
        resetloadingtextcolor()
        resetinput(10.0)
        Return $00
    EndIf
    Return $00
End Function
