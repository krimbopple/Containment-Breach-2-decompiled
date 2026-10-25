Function GUESSEDgetmax#(arg0.TX2BF6X0FF4, arg1.TX2BF6X0FF4)
    Local local0.rooms
    Local local1.rooms
    Local local2%
    Local local3%
    local0 = XXDB6F64F2[arg0\Field3]
    local1 = XXDB6F64F2[arg1\Field3]
    If ((((local0 = Null) Lor (local1 = Null)) Lor (local0 = local1)) <> 0) Then
        Return 1.0
    EndIf
    For local2 = $00 To $03 Step $01
        If (local0\Field29[local2] <> Null) Then
            If (local0\Field29[local2] = local1) Then
                If (local0\Field10[local2] <> Null) Then
                    Return max((local0\Field10[local2]\Field13 / 180.0), 0.13)
                EndIf
                Return 1.0
            EndIf
        EndIf
    Next
    Return 0.125
    Return 0.0
End Function
