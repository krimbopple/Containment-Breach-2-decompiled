Function removeparticle%(arg0.particles)
    If (arg0 = Null) Then
        Return $00
    EndIf
    freeentity(arg0\Field10)
    Return $00
End Function
