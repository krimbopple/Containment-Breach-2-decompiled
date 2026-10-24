Function removedecal%(arg0.decals)
    If (arg0 = Null) Then
        Return $00
    EndIf
    freeentity(arg0\Field0)
    Return $00
End Function
