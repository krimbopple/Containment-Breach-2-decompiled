Function deletetextureentriesfromcache%(arg0%)
    Local local0.textureincache
    Local local1%
    For local0 = Each textureincache
        If (local0\Field1 <= arg0) Then
            If (local0\Field2 <> $00) Then
                freetexture(local0\Field2)
                local0\Field2 = $00
            EndIf
            Delete local0
        EndIf
    Next
    Return $00
End Function
