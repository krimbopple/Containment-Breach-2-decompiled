Function removedecalinstances%()
    Local local0%
    For local0 = $00 To $19 Step $01
        de_i\Field0[local0] = $00
    Next
    Delete Each C20Z244FB
    Delete de_i
    de_i = Null
    Return $00
End Function
