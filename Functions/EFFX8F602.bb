Function EFFX8F602%(arg0%, arg1%)
    Local local0.TF2886ZFB2
    For local0 = Each TF2886ZFB2
        If (local0\Field0 = arg1) Then
            TX4022X8Z0Z(arg0, arg1, local0\Field1, local0\Field2)
        EndIf
    Next
    Return $00
End Function
