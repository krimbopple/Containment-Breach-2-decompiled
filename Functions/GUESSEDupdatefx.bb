Function GUESSEDupdatefx%(arg0%)
    Local local0$
    Local local1%
    Local local2.TXX8FZB666Z
    If (X2FZ42644B[arg0] = Null) Then
        local0 = ""
        local1 = $00
        For local2 = Each TXX8FZB666Z
            If ((local2\Field0 And arg0) <> $00) Then
                local0 = ((local0 + local2\Field1) + " ")
                local1 = (local1 Or local2\Field0)
            EndIf
        Next
        If (local1 <> arg0) Then
            Return $00
        EndIf
        If (GUESSEDcreatedeferred_2(arg0, "Shade.fx", local0) = $00) Then
            Return $00
        EndIf
    EndIf
    Return X2FZ42644B[arg0]\Field1
    Return $00
End Function
