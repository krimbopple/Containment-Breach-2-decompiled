Function D424F0DB6.TXD6DBZ6XZ4(arg0%, arg1$)
    Local local0%
    Local local1.TXD6DBZ6XZ4
    If (X2Z4BBF84Z[arg0] <> Null) Then
        Return Null
    EndIf
    arg1 = lower(arg1)
    local0 = $00
    For local1 = Each TXD6DBZ6XZ4
        If (local1\Field1 = arg1) Then
            local0 = local1\Field0
            Exit
        EndIf
    Next
    If (local0 = $00) Then
        local0 = loadanimmesh_strict(arg1, $00, (instr(arg1, "addons", $01) < $01))
    EndIf
    X2Z4BBF84Z[arg0] = (New TXD6DBZ6XZ4)
    X2Z4BBF84Z[arg0]\Field3 = (New X44ZF6442X)
    X2Z4BBF84Z[arg0]\Field2 = arg0
    X2Z4BBF84Z[arg0]\Field0 = local0
    X2Z4BBF84Z[arg0]\Field1 = arg1
    hideentity(X2Z4BBF84Z[arg0]\Field0)
    Return X2Z4BBF84Z[arg0]
    Return Null
End Function
