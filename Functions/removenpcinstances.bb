Function removenpcinstances%()
    Local local0%
    For local0 = $00 To $21 Step $01
        freeentity(n_i\Field9[local0])
        n_i\Field9[local0] = $00
    Next
    Delete n_i
    n_i = Null
    Return $00
End Function
