Function T8648Z2B2Z%(arg0$)
    Local local0.T8624FD424
    arg0 = lower(arg0)
    For local0 = Each T8624FD424
        If (local0\Field1 = arg0) Then
            local0\Field2 = T2B824D06D(arg0)
        EndIf
    Next
    Return $00
End Function
