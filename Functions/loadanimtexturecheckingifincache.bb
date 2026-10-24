Function loadanimtexturecheckingifincache%(arg0$, arg1%, arg2%, arg3%, arg4%, arg5%, arg6%)
    Local local0.textureincache
    Local local1$
    If (arg0 = "") Then
        Return $00
    EndIf
    arg0 = lower(arg0)
    For local0 = Each textureincache
        If (((local0\Field0 <> "CTUCS") And (arg0 = local0\Field0)) <> 0) Then
            If (local0\Field1 < arg6) Then
                local0\Field1 = arg6
            EndIf
            Return local0\Field2
        EndIf
    Next
    local1 = stripabsolutepath(arg0, "gfx\")
    local0 = (New textureincache)
    local0\Field0 = arg0
    local0\Field1 = arg6
    If (filetype((lang\Field0 + local1)) = $01) Then
        local1 = (lang\Field0 + local1)
    EndIf
    local0\Field2 = loadanimtexture(local1, arg1, arg2, arg3, arg4, arg5)
    Return local0\Field2
    Return $00
End Function
