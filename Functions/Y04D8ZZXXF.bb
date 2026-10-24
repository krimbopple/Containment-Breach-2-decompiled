Function Y04D8ZZXXF%(arg0.T20BFZFZ62X, arg1%, arg2.TXX0ZX4BDF2)
    Local local0.TB86B8F2BX
    Local local1%
    If (((arg0 = Null) Lor (arg0\Field10[arg1] = arg2)) <> 0) Then
        Return $00
    EndIf
    If (arg0\Field20[arg1] <> $00) Then
        arg0\Field18 = (arg0\Field18 - $01)
        freeentity(arg0\Field20[arg1])
        arg0\Field20[arg1] = $00
        arg0\Field10[arg1] = Null
    EndIf
    If (arg2 = Null) Then
        Return $00
    EndIf
    local0 = arg2\Field3[arg0\Field15]
    If (((local0 = Null) Lor (arg2\Field0[local0\Field6] = $00)) <> 0) Then
        Return $00
    EndIf
    local1 = findchild(arg0\Field19, local0\Field5)
    If (local1 = $00) Then
        Return $00
    EndIf
    arg0\Field10[arg1] = arg2
    If (arg0\Field10[arg1]\Field9[local0\Field6] <> "") Then
        arg0\Field20[arg1] = copyentity(arg0\Field10[arg1]\Field0[local0\Field6], local1)
    Else
        arg0\Field20[arg1] = A464F2006(arg0\Field10[arg1]\Field0[local0\Field6], local1)
    EndIf
    positionentity(arg0\Field20[arg1], local0\Field0, local0\Field2, local0\Field1, $00)
    rotateentity(arg0\Field20[arg1], local0\Field8, local0\Field4, local0\Field3, $00)
    scaleentity(arg0\Field20[arg1], local0\Field7, local0\Field7, local0\Field7, $00)
    If (arg0\Field10[arg1]\Field9[local0\Field6] <> "") Then
        entitytexture(arg0\Field20[arg1], loadtexture_strict(arg0\Field10[arg1]\Field9[local0\Field6], $01, $01, 1.0), $00, $00)
        X8F80Z2886(arg0\Field20[arg1], $FFFFFFFF, $00)
    EndIf
    arg0\Field18 = (arg0\Field18 + $01)
    Return $00
End Function
