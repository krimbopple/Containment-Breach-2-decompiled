Function removeroomtemplate%(arg0.roomtemplates)
    If (arg0\Field0 <> $00) Then
        freeentity(arg0\Field0)
        arg0\Field0 = $00
    EndIf
    Delete arg0
    Return $00
End Function
