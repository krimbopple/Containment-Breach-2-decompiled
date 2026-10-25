Function GUESSEDupdateobjects_7%(arg0%, arg1$)
    Local local0.TBZZ66Z8FZ
    For local0 = Each TBZZ66Z8FZ
        If (local0\Field0 = arg0) Then
            local0\Field1 = arg1
            Return $00
        EndIf
    Next
    local0 = (New TBZZ66Z8FZ)
    local0\Field0 = arg0
    local0\Field1 = arg1
    Return $00
End Function
