Function TXX20828D66%(arg0.D6BZZF0B6)
    If (arg0 = Null) Then
        Return $00
    EndIf
    setfontex(XD00026ZX2\Field0[$00])
    freefont(arg0\Field1)
    arg0\Field1 = $00
    Delete arg0
    Return $00
End Function
