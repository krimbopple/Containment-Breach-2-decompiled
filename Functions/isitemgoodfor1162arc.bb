Function isitemgoodfor1162arc%(arg0.itemtemplates)
    Select arg0\Field9
        Case $59,$5A,$5B,$5C
            Return $01
        Case $61,$63,$02,$2F
            Return $01
        Case $27,$28,$38
            Return $01
        Case $45,$46
            Return $01
        Case $30,$55,$0E,$0F,$10
            Return $01
        Default
            If (arg0\Field9 <> $00) Then
                Return $00
            ElseIf ((((instr(arg0\Field19, "Leaflet", $01) Lor instr(arg0\Field19, "SCP-085", $01)) Lor instr(arg0\Field19, "Blank", $01)) Lor instr(arg0\Field19, "Drawing", $01)) <> 0) Then
                Return $00
            Else
                Return ((instr(arg0\Field19, "Note", $01) = $00) And (instr(arg0\Field19, "Log", $01) = $00))
            EndIf
    End Select
    Return $00
End Function
