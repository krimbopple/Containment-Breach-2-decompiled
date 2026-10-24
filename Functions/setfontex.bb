Function setfontex%(arg0%)
    If (arg0 = $00) Then
        arg0 = XD00026ZX2\Field0[$00]
    EndIf
    setfont(arg0)
    Return $00
End Function
