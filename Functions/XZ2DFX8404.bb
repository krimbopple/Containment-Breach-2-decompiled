Function XZ2DFX8404%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    
    local0 = eax_0007
    If (local0 <> $00) Then
        local1 = TD4644B68Z(TX0Z2Z4F86D(local0, "news"))
        local2 = TD0DFDZ4XX(local1)
        For local3 = $00 To (local2 - $01) Step $01
            TXZ2ZBDZZ42(TX240XXB6Z6(TX0Z2Z4F86D(D8XX4X0D0(local1, local3), "image")), TX240XXB6Z6(TX0Z2Z4F86D(D8XX4X0D0(local1, local3), "text")), TX240XXB6Z6(TX0Z2Z4F86D(D8XX4X0D0(local1, local3), "url")))
        Next
        Y00DFZDDF6(local0)
    EndIf
    Return $00
End Function
