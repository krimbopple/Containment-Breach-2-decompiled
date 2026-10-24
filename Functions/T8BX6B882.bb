Function T8BX6B882%(arg0.menubutton)
    If (arg0\Field6 = $00) Then
        renderframe(arg0\Field12, arg0\Field0, arg0\Field7, arg0\Field1, (arg0\Field12 Mod $100), (arg0\Field0 Mod $100), arg0\Field5, $01)
        If ((((0.0 < arg0\Field4) And (arg0\Field10 = $00)) Lor (arg0\Field5 And arg0\Field10)) <> 0) Then
            color($2D, $2D, $2D, (Int (arg0\Field4 * 145.0)))
            rect((Int ((Float arg0\Field12) + max((1.0 * menuscale), 1.0))), (Int ((Float arg0\Field0) + max((1.0 * menuscale), 1.0))), (Int ((Float arg0\Field7) - max((2.0 * menuscale), 1.0))), (Int ((Float arg0\Field1) - max((2.0 * menuscale), 1.0))), $01)
        EndIf
        If (arg0\Field5 <> 0) Then
            If ((((arg0\Field2 <> $FF) Lor (arg0\Field9 <> $FF)) Lor (arg0\Field8 <> $FF)) <> 0) Then
                color(arg0\Field2, arg0\Field9, arg0\Field8, $FF)
            Else
                color($B4, $B4, $B4, $FF)
            EndIf
        Else
            color(arg0\Field2, arg0\Field9, arg0\Field8, $FF)
        EndIf
        setfontex(XD00026ZX2\Field0[arg0\Field14])
        X44ZBBZ44X((((Float (arg0\Field7 Sar $01)) * arg0\Field11) + (Float arg0\Field12)), (Float (arg0\Field0 + (arg0\Field1 Sar $01))), XX8XZZFFF(arg0\Field13), (1.0 = arg0\Field11), $01, 1.0, $00, 0.0)
        arg0\Field6 = $01
    EndIf
    Return $00
End Function
