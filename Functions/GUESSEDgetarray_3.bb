Function GUESSEDgetarray_3%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4.DBXD0D0XD
    
    local0 = eax_0007
    If (local0 <> $00) Then
        local1 = _JsonGetArray(_JsonGetValue(local0, "screens"))
        local2 = _JsonGetArraySize(local1)
        For local3 = $00 To (local2 - $01) Step $01
            local4 = (New DBXD0D0XD)
            local4\Field2 = loadimage_strict(_JsonGetString(_JsonGetValue(_JsonGetArrayValue(local1, local3), "image")))
            resizeimage(local4\Field2, graphicswidth(), graphicsheight())
            local4\Field1 = 0.0
        Next
        _JsonFreeDocument(local0)
    EndIf
    Return $00
End Function
