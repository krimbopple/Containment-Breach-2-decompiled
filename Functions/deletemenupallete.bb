Function deletemenupallete%(arg0.menupalette)
    If (arg0\Field3 <> $00) Then
        freeimage(arg0\Field3)
        arg0\Field3 = $00
    EndIf
    Delete arg0
    Return $00
End Function
