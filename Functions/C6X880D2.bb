Function C6X880D2%(arg0.T20BFZFZ62X)
    Local local0%
    Local local1%
    local0 = (arg0\Field2 + $3F2)
    local0 = (((local0 Shl $05) + local0) Xor (arg0\Field18 > $00))
    local0 = (((local0 Shl $05) + local0) Xor arg0\Field7)
    local0 = (((local0 Shl $05) + local0) Xor arg0\Field13)
    local0 = (((local0 Shl $05) + local0) Xor arg0\Field15)
    local0 = (((local0 Shl $05) + local0) Xor arg0\Field16)
    local0 = (((local0 Shl $05) + local0) Xor (Int (entityx(arg0\Field19, $00, 1.0) * 100.0)))
    local0 = (((local0 Shl $05) + local0) Xor (Int (entityy(arg0\Field19, $00, 1.0) * 100.0)))
    local0 = (((local0 Shl $05) + local0) Xor (Int (entityz(arg0\Field19, $00, 1.0) * 100.0)))
    local0 = (((local0 Shl $05) + local0) Xor (Int (entityyaw(arg0\Field19, $00, 1.0) * 10.0)))
    local0 = (((local0 Shl $05) + local0) Xor arg0\Field0)
    local0 = (((local0 Shl $05) + local0) Xor arg0\Field5)
    If (arg0\Field18 > $00) Then
        For local1 = $00 To $09 Step $01
            If (arg0\Field10[local1] <> Null) Then
                local0 = (((local0 Shl $05) + local0) Xor arg0\Field10[local1]\Field5)
            EndIf
        Next
    EndIf
    If (local0 = $00) Then
        local0 = $01
    EndIf
    Return local0
    Return $00
End Function
