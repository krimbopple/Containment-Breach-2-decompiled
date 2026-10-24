Function X6X2XXD8Z0%(arg0$)
    If (filetype((lang\Field0 + arg0)) = $01) Then
        arg0 = (lang\Field0 + arg0)
    EndIf
    Return (filetype(arg0) = $01)
    Return $00
End Function
