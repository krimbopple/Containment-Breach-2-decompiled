Function GUESSEDgetmissingtexture%(arg0.materials, arg1%)
    If (arg0\Field10[arg1] = $00) Then
        Return missingtexture
    EndIf
    Return arg0\Field10[arg1]
    Return $00
End Function
