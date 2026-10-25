Function GUESSEDupdateobjects_33%(arg0%, arg1$)
    Local local0.TXX8FZB666Z
    For local0 = Each TXX8FZB666Z
        If (local0\Field0 = arg0) Then
            local0\Field1 = arg1
            Return $00
        EndIf
    Next
    local0 = (New TXX8FZB666Z)
    local0\Field0 = arg0
    local0\Field1 = arg1
    Return $00
End Function
