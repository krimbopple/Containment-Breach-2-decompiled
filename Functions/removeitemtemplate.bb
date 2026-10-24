Function removeitemtemplate%(arg0.itemtemplates)
    If (arg0\Field0 <> $00) Then
        freeentity(arg0\Field0)
    EndIf
    freeentity(arg0\Field21)
    arg0\Field21 = $00
    freeimage(arg0\Field14)
    arg0\Field14 = $00
    If (arg0\Field10 <> $00) Then
        freeimage(arg0\Field10)
        arg0\Field10 = $00
    EndIf
    If (arg0\Field25 <> $00) Then
        freeimage(arg0\Field25)
        arg0\Field25 = $00
    EndIf
    If (arg0\Field15 <> $00) Then
        freeimage(arg0\Field15)
        arg0\Field15 = $00
    EndIf
    If (arg0\Field22 <> $00) Then
        deletesingletextureentryfromcache(arg0\Field22, $00)
        arg0\Field22 = $00
    EndIf
    Delete arg0
    Return $00
End Function
