Function X4F8FDFX04%(arg0.materials, arg1%)
    Local local0%
    local0 = arg1
    If (local0 = $04) Then
        If (arg0\Field15[arg1] = "") Then
            arg0\Field10[arg1] = X82B8D6ZD6
        EndIf
    EndIf
    If (((arg0\Field10[arg1] = $00) And (arg0\Field15[arg1] <> "")) <> 0) Then
        If ((arg0\Field4 And (arg1 <> $04)) <> 0) Then
            arg0\Field10[arg1] = loadanimtexture_strict(arg0\Field15[arg1], $01, arg0\Field1, arg0\Field2, arg0\Field3, arg0\Field18, $01)
        Else
            arg0\Field10[arg1] = loadtexture_strict(arg0\Field15[arg1], (((arg1 = $04) Shl $07) + $01), $01, 1.0)
        EndIf
    EndIf
    If (arg0\Field10[arg1] <> $00) Then
        textureblend(arg0\Field10[arg1], $00)
    EndIf
    Return $00
End Function
