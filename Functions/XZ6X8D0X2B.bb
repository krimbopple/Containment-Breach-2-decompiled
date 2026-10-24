Function XZ6X8D0X2B%(arg0%, arg1$)
    Local local0%
    Local local1.TXD6DBZ6XZ4
    If (((X2Z4BBF84Z[arg0] = Null) Lor (arg0 = $00)) <> 0) Then
        Return $00
    EndIf
    local0 = $FFFFFFFF
    For local1 = Each TXD6DBZ6XZ4
        If (local1\Field3\Field49 = arg1) Then
            local0 = local1\Field3\Field4
            Exit
        EndIf
    Next
    If (local0 = $FFFFFFFF) Then
        local0 = loadsound_strict(arg1)
    EndIf
    X2Z4BBF84Z[arg0]\Field3\Field49 = arg1
    X2Z4BBF84Z[arg0]\Field3\Field4 = local0
    Return $00
End Function
