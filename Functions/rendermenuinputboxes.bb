Function rendermenuinputboxes%()
    Local local0.menuinputbox
    Local local1$
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    For local0 = Each menuinputbox
        renderframe(local0\Field3, local0\Field0, local0\Field7, local0\Field1, (local0\Field3 Mod $100), (local0\Field0 Mod $100), $00, $01)
        setfontex(XD00026ZX2\Field0[local0\Field4])
        local1 = local0\Field6
        If (((1.0 <> local0\Field10) And (stringwidth(local1) > (local0\Field7 - (stringwidth("A") Shl $01)))) <> 0) Then
            local1 = right(local1, (Int max((Float ((local0\Field7 - (stringwidth("A") Shl $01)) / stringwidth("A"))), 0.0)))
        EndIf
        local2 = (Int ((((Float (local0\Field7 Sar $01)) * local0\Field10) + (Float local0\Field3)) - (Float ((stringwidth(local1) Sar $01) * (1.0 = local0\Field10)))))
        If (local0\Field2 = $00) Then
            If (mouseon(local0\Field3, local0\Field0, local0\Field7, local0\Field1) <> 0) Then
                color($32, $32, $32, $80)
                rect((Int ((Float local0\Field3) + (3.0 * menuscale))), (Int ((Float local0\Field0) + (3.0 * menuscale))), (Int ((Float local0\Field7) - (6.0 * menuscale))), (Int ((Float local0\Field1) - (6.0 * menuscale))), $01)
            EndIf
            If ((((selectedinputbox = local0\Field5) And (TZFXXZB824 >= $00)) And (TZFXXZB824 <> cursorpos)) <> 0) Then
                local3 = (Int min((Float cursorpos), (Float TZFXXZB824)))
                local4 = (Int max((Float cursorpos), (Float TZFXXZB824)))
                local5 = (stringwidth(left(local1, local3)) + local2)
                local6 = stringwidth(mid(local1, (local3 + $01), (local4 - local3)))
                color($00, $78, $D7, $FF)
                rect(local5, (Int ((Float (local0\Field0 + (local0\Field1 Sar $01))) - (6.0 * menuscale))), local6, (Int (14.0 * menuscale)), $01)
            EndIf
            color($FF, $FF, $FF, $FF)
            If (((selectedinputbox = local0\Field5) And (TZFXXZB824 = cursorpos)) <> 0) Then
                If (((((millisecs() Mod $320) < $190) Lor keydown($CD)) Lor keydown($CB)) <> 0) Then
                    rect((stringwidth(left(local1, (Int max((Float cursorpos), 0.0)))) + local2), (Int ((Float (local0\Field0 + (local0\Field1 Sar $01))) - (5.0 * menuscale))), (Int (2.0 * menuscale)), (Int (12.0 * menuscale)), $01)
                EndIf
            EndIf
        EndIf
        color($FF, $FF, $FF, $FF)
        textex((Int (((Float (local0\Field7 Sar $01)) * local0\Field10) + (Float local0\Field3))), (local0\Field0 + (local0\Field1 Sar $01)), local1, (Int local0\Field10), $01)
    Next
    Return $00
End Function
