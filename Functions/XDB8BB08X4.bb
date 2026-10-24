Function XDB8BB08X4%(arg0$, arg1%, arg2.TX2BF6X0FF4, arg3#, arg4#, arg5#, arg6#, arg7#)
    Local local0%
    Local local1.TX2BF6X0FF4
    If ((((X4BX024DX0() = $00) Lor (TXB2BFFFFFX() = $00)) Lor (arg0 = "")) <> 0) Then
        Return $00
    EndIf
    local0 = $00
    If (arg2 <> Null) Then
        local0 = arg2\Field13
    EndIf
    For local1 = Each TX2BF6X0FF4
        If (((local1\Field13 > $01) And (local1\Field13 <> local0)) <> 0) Then
            TD0ZB8B8XB(local1, arg0, arg1, local0, arg3, arg4, arg5, arg6, arg7)
        EndIf
    Next
    Return $00
End Function
