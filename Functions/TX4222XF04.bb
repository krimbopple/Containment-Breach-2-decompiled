Function TX4222XF04%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4.DBXD0D0XD
    
    local0 = eax_0007
    If (local0 <> $00) Then
        local1 = TD4644B68Z(TX0Z2Z4F86D(local0, "screens"))
        local2 = TD0DFDZ4XX(local1)
        For local3 = $00 To (local2 - $01) Step $01
            local4 = (New DBXD0D0XD)
            local4\Field2 = loadimage_strict(TX240XXB6Z6(TX0Z2Z4F86D(D8XX4X0D0(local1, local3), "image")))
            resizeimage(local4\Field2, graphicswidth(), graphicsheight())
            local4\Field1 = 0.0
        Next
        Y00DFZDDF6(local0)
    EndIf
    Return $00
End Function
