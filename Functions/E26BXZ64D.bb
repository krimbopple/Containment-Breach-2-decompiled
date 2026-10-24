Function E26BXZ64D.materials(arg0%)
    Local local0.materials
    Local local1$
    Local local2%
    Local local3%
    local1 = lower(strippath(texturename(arg0)))
    For local0 = Each materials
        If (local0\Field7 = local1) Then
            Return local0
        EndIf
    Next
    Return Null
    Return Null
End Function
