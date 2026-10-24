Function TBB628DX04%()
    Local local0%
    For local0 = $00 To $04 Step $01
        TXFD22D0402\Field4[local0] = $00
    Next
    Return $00
End Function
