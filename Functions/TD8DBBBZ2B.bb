Function TD8DBBBZ2B%(arg0#, arg1%)
    Local local0.F4X4XZ2BZ
    If (((arg0 <> X0844FD2Z6) Lor arg1) <> 0) Then
        X0844FD2Z6 = arg0
        For local0 = Each F4X4XZ2BZ
            If ((local0\Field0 And $10) <> 0) Then
                effectfloat(local0\Field1, "EmissiveMultiply", X0844FD2Z6, $00)
            EndIf
        Next
    EndIf
    Return $00
End Function
