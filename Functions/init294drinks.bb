Function init294drinks%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    If (i_294\Field2 <> $00) Then
        _JsonFreeDocument(i_294\Field2)
    EndIf
    i_294\Field2 = _JsonParseFromFile((lang\Field0 + "Data\SCP-294.jsonc"))
    If (_JsonIsArray(i_294\Field2) <> 0) Then
        i_294\Field0 = _JsonGetArray(i_294\Field2)
    Else
        _JsonFreeDocument(i_294\Field2)
        
        i_294\Field2 = eax_003A
        i_294\Field0 = _JsonGetArray(i_294\Field2)
    EndIf
    i_294\Field3 = _CreateS2IMap()
    local2 = _JsonGetArraySize(i_294\Field0)
    For local0 = $00 To (local2 - $01) Step $01
        local3 = _JsonGetArray(_JsonGetValue(_JsonGetArrayValue(i_294\Field0, local0), "name"))
        local4 = _JsonGetArraySize(local3)
        For local1 = $00 To (local4 - $01) Step $01
            _S2IMapSet(i_294\Field3, upper(_JsonGetString(_JsonGetArrayValue(local3, local1))), local0)
        Next
    Next
    Return $00
End Function
