Function removescreen%(arg0.screens)
    freeentity(arg0\Field10)
    arg0\Field10 = $00
    deletesingletextureentryfromcache(arg0\Field8, $00)
    arg0\Field8 = $00
    If (arg0\Field3 <> $00) Then
        freeimage(arg0\Field3)
        arg0\Field3 = $00
    EndIf
    If (arg0\Field11 <> Null) Then
        removelight(arg0\Field11)
    EndIf
    Delete arg0
    Return $00
End Function
