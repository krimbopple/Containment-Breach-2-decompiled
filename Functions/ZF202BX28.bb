Function ZF202BX28%(arg0$)
    If ((((((arg0 = "") Lor instr(arg0, "..", $01)) Lor instr(arg0, "%", $01)) Lor instr(arg0, "&", $01)) Lor instr(arg0, "?", $01)) <> 0) Then
        Return $00
    EndIf
    Return $01
    Return $00
End Function
