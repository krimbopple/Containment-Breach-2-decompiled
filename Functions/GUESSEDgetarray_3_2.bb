Function GUESSEDgetarray_3_2%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    
    local0 = eax_0007
    If (local0 <> $00) Then
        local1 = _JsonGetArray(_JsonGetValue(local0, "news"))
        local2 = _JsonGetArraySize(local1)
        For local3 = $00 To (local2 - $01) Step $01
            GUESSEDloadimage(_JsonGetString(_JsonGetValue(_JsonGetArrayValue(local1, local3), "image")), _JsonGetString(_JsonGetValue(_JsonGetArrayValue(local1, local3), "text")), _JsonGetString(_JsonGetValue(_JsonGetArrayValue(local1, local3), "url")))
        Next
        _JsonFreeDocument(local0)
    EndIf
    Return $00
End Function
