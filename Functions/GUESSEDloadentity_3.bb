Function GUESSEDloadentity_3.XZ8B4B628(arg0$, arg1$, arg2$, arg3#, arg4#, arg5%, arg6%, arg7#)
    Local local0.XZ8B4B628
    Local local1.XZ8B4B628
    Local local2%
    arg1 = lower(arg1)
    arg2 = lower(arg2)
    local0 = (New XZ8B4B628)
    For local1 = Each XZ8B4B628
        If (local1\Field5 = arg1) Then
            local0\Field3 = copyentity(local1\Field3, $00)
            Exit
        EndIf
    Next
    If (local0\Field3 = $00) Then
        local0\Field3 = loadanimmesh_strict(arg1, $00, $01)
    EndIf
    local2 = loadtexture(arg2, $01)
    If (local2 <> $00) Then
        entitytexture(local0\Field3, local2, $00, $00)
    EndIf
    freetexture(local2)
    local0\Field2 = arg0
    local0\Field5 = arg1
    local0\Field4 = arg3
    local0\Field0 = arg4
    local0\Field1 = arg2
    GUESSEDcreatesurface(local0\Field3, $00, $11000)
    extractanimseq(local0\Field3, GetFirstPackedValue(arg6), GetSecondPackedValue(arg6), $00, "")
    animate(local0\Field3, $01, arg7, $01, 0.0)
    rotateentity(local0\Field3, 0.0, (Float arg5), 0.0, $00)
    Return local0
    Return Null
End Function
