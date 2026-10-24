Function XBB8DFD22Z%(arg0%, arg1%, arg2$, arg3%)
    Local local0%
    Local local1%
    Local local2.TXD6DBZ6XZ4
    If ((((X2Z4BBF84Z[arg0] = Null) Lor (arg0 = $00)) Lor (arg1 >= $04)) <> 0) Then
        Return $00
    EndIf
    If (arg2 = "") Then
        X2Z4BBF84Z[arg0]\Field3\Field10[arg1] = $00
        X2Z4BBF84Z[arg0]\Field3\Field40 = $00
        For local0 = $00 To $03 Step $01
            If (X2Z4BBF84Z[arg0]\Field3\Field10[local0] <> $00) Then
                X2Z4BBF84Z[arg0]\Field3\Field40 = (X2Z4BBF84Z[arg0]\Field3\Field40 + $01)
            EndIf
        Next
        Return $00
    EndIf
    local1 = $FFFFFFFF
    For local2 = Each TXD6DBZ6XZ4
        For local0 = $00 To $03 Step $01
            If (local2\Field3\Field8[local0] = arg2) Then
                local1 = local2\Field3\Field10[local0]
                Exit
            EndIf
        Next
        If (local1 <> $FFFFFFFF) Then
            Exit
        EndIf
    Next
    If (local1 = $FFFFFFFF) Then
        local1 = loadsound_strict(arg2)
    EndIf
    X2Z4BBF84Z[arg0]\Field3\Field8[arg1] = arg2
    X2Z4BBF84Z[arg0]\Field3\Field10[arg1] = local1
    X2Z4BBF84Z[arg0]\Field3\Field48[arg1] = arg3
    X2Z4BBF84Z[arg0]\Field3\Field40 = $00
    For local0 = $00 To $03 Step $01
        If (X2Z4BBF84Z[arg0]\Field3\Field10[local0] <> $00) Then
            X2Z4BBF84Z[arg0]\Field3\Field40 = (X2Z4BBF84Z[arg0]\Field3\Field40 + $01)
        EndIf
    Next
    Return $01
    Return $00
End Function
