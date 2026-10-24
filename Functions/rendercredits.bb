Function rendercredits%()
    Local local0.creditsline
    Local local1.creditsline
    Local local2#
    Local local3%
    Local local4%
    Local local5%
    local2 = (((XZ0260X8X2\Field2 + 2000.0) / 2.0) + ((Float opt\Field46) + 10.0))
    local3 = $00
    local4 = $00
    cls()
    hidepointer()
    If (rand($12C, $01) > $01) Then
        drawblock(XZ0260X8X2\Field67, (Int ((Float TDD0Z6BXB6\Field9) - (400.0 * menuscale))), $00, $00)
    EndIf
    local1 = Null
    color($FF, $FF, $FF, $FF)
    For local0 = Each creditsline
        local0\Field1 = local3
        If (left(local0\Field2, $01) = "*") Then
            setfontex(XD00026ZX2\Field0[$07])
            If (local0\Field0 = $00) Then
                textex(TDD0Z6BXB6\Field6, (Int (((Float (local0\Field1 * $18)) * menuscale) + local2)), right(local0\Field2, (len(local0\Field2) - $01)), $01, $00)
            EndIf
        ElseIf (left(local0\Field2, $01) = "/") Then
            local1 = (Before local0)
        Else
            setfontex(XD00026ZX2\Field0[$06])
            If (local0\Field0 = $00) Then
                textex(TDD0Z6BXB6\Field6, (Int (((Float (local0\Field1 * $18)) * menuscale) + local2)), local0\Field2, $01, $00)
            EndIf
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
        If (((0.0 <= XZ0260X8X2\Field50) And (255.0 > XZ0260X8X2\Field50)) <> 0) Then
            local5 = (Int clamp(XZ0260X8X2\Field50, 0.0, 255.0))
            color(local5, local5, local5, $FF)
        ElseIf (255.0 <= XZ0260X8X2\Field50) Then
            color($FF, $FF, $FF, $FF)
        Else
            local5 = (Int clamp((- XZ0260X8X2\Field50), 0.0, 255.0))
            color(local5, local5, local5, $FF)
        EndIf
    EndIf
    If (0.0 <> XZ0260X8X2\Field50) Then
        For local0 = Each creditsline
            If (local0\Field0 <> 0) Then
                setfontex(XD00026ZX2\Field0[$06])
                If (left(local0\Field2, $01) = "/") Then
                    textex(TDD0Z6BXB6\Field6, (Int ((Float (TDD0Z6BXB6\Field9 + (local4 Sar $01))) + ((Float (local0\Field1 * $18)) * menuscale))), right(local0\Field2, (len(local0\Field2) - $01)), $01, $00)
                Else
                    textex(TDD0Z6BXB6\Field6, (Int ((((Float ((local0\Field1 - local1\Field1) * $18)) * menuscale) + (Float TDD0Z6BXB6\Field9)) - ((Float ((local4 Sar $01) * $18)) * menuscale))), local0\Field2, $01, $00)
                EndIf
            EndIf
        Next
    EndIf
    renderloadingtext((Int (20.0 * menuscale)), (Int ((Float opt\Field46) - (35.0 * menuscale))), getlocalstring("menu", "anykey"), $00, $00)
    If (-1.0 = XZ0260X8X2\Field50) Then
        freefont(XD00026ZX2\Field0[$06])
        XD00026ZX2\Field0[$06] = $00
        freefont(XD00026ZX2\Field0[$07])
        XD00026ZX2\Field0[$07] = $00
        freeimage(XZ0260X8X2\Field67)
        XZ0260X8X2\Field67 = $00
        freeimage(XZ0260X8X2\Field49)
        XZ0260X8X2\Field49 = $00
        Return $00
    EndIf
    Return $00
End Function
