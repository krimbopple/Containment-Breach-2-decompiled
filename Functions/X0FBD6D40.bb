Function X0FBD6D40%(arg0.T20BFZFZ62X, arg1#, arg2#, arg3#, arg4#, arg5%, arg6%)
    Local local0.X44ZF6442X
    Local local1%
    Local local2#
    Local local3%
    Local local4%
    local0 = T60880B62X(arg5)
    If (local0 = Null) Then
        Return $00
    EndIf
    local1 = $FFFFFFFF
    local2 = 1.0
    If (arg0\Field19 <> $00) Then
        local2 = animtime(arg0\Field19)
        local1 = arg0\Field13
        For local3 = $00 To $09 Step $01
            Y04D8ZZXXF(arg0, local3, Null)
        Next
        freeentity(arg0\Field19)
        arg0\Field19 = $00
    EndIf
    arg0\Field19 = copyentity(BXF028D8B(arg5), $00)
    If (XFZF6880B0(arg6) <> "") Then
        entitytexture(arg0\Field19, loadtexture_strict(XFZF6880B0(arg6), $01, $01, 1.0), $00, $00)
    ElseIf (X8B806F000(arg6) <> "") Then
        entitytexture(arg0\Field19, loadtexture_strict(X8B806F000(arg6), $01, $01, 1.0), $00, $00)
    EndIf
    X8F80Z2886(arg0\Field19, $30000, $00)
    positionentity(arg0\Field19, arg1, arg2, arg3, $00)
    rotateentity(arg0\Field19, 0.0, arg4, 0.0, $00)
    scaleentity(arg0\Field19, local0\Field24, local0\Field24, local0\Field24, $01)
    arg0\Field4 = createpivot(arg0\Field19)
    translateentity(arg0\Field4, 0.0, (- local0\Field56), 0.0, $01)
    entityradius(arg0\Field4, 0.1, 0.0)
    resetentity(arg0\Field4)
    If (local1 <> $FFFFFFFF) Then
        local4 = local0\Field22[local1]
        If (local4 <> $00) Then
            animate(arg0\Field19, $03, 200.0, extractanimseq(arg0\Field19, TFDFXFF244(local4), XZZF4F4DZ0(local4), $00, ""), 0.0)
        Else
            setanimtime(arg0\Field19, local2, $00)
        EndIf
    EndIf
    arg0\Field15 = arg5
    arg0\Field16 = arg6
    Return $01
    Return $00
End Function
