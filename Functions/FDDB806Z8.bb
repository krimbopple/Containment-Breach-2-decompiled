Function FDDB806Z8%()
    Local local0.TX6BX06BD28
    For local0 = Each TX6BX06BD28
        color($FF, $FF, $FF, $FF)
        setfontex(XD00026ZX2\Field0[local0\Field4])
        X44ZBBZ44X((((Float (local0\Field7 Sar $01)) * local0\Field5) + (Float local0\Field3)), (Float (local0\Field0 + (local0\Field1 Sar $01))), XX8XZZFFF(local0\Field6), (1.0 = local0\Field5), $01, 1.0, local0\Field2, 0.0)
    Next
    Return $00
End Function
