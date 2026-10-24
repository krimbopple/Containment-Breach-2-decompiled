Function removeparticleinstances%()
    Local local0%
    For local0 = $00 To $0F Step $01
        p_i\Field0[local0] = $00
    Next
    Delete p_i
    p_i = Null
    Return $00
End Function
