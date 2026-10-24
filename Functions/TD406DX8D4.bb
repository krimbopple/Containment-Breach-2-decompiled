Function TD406DX8D4%(arg0%, arg1%)
    Local local0.TXX84B42ZBB
    For local0 = Each TXX84B42ZBB
        If (((texturewidth(local0\Field0) = arg0) And (textureheight(local0\Field0) = arg1)) <> 0) Then
            Return local0\Field0
        EndIf
    Next
    Return $00
    Return $00
End Function
