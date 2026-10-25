Function GUESSEDsetfield%(arg0.items, arg1%)
    Local local0%
    Local local1%
    local0 = (arg0\Field27 + $3F2)
    local0 = (((local0 Shl $05) + local0) Xor arg0\Field29)
    local0 = (((local0 Shl $05) + local0) Xor arg0\Field18)
    local0 = (((local0 Shl $05) + local0) Xor (Int (arg0\Field15 * 100.0)))
    local0 = (((local0 Shl $05) + local0) Xor (Int (arg0\Field3 * 100.0)))
    local0 = (((local0 Shl $05) + local0) Xor arg0\Field16)
    local0 = (((local0 Shl $05) + local0) Xor arg0\Field14)
    local0 = (((local0 Shl $05) + local0) Xor arg0\Field38)
    local0 = (((local0 Shl $05) + local0) Xor (Int (arg0\Field1 * 100.0)))
    If (((arg0\Field31 = $02) And (arg1 = $00)) <> 0) Then
        For local1 = $00 To (arg0\Field36 - $01) Step $01
            If (arg0\Field8[local1] <> Null) Then
                local0 = (((local0 Shl $05) + local0) Xor GUESSEDsetfield(arg0\Field8[local1], $01))
            EndIf
        Next
    EndIf
    If (local0 = $00) Then
        local0 = $01
    EndIf
    Return local0
    Return $00
End Function
