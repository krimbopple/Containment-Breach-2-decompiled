Function GUESSEDupdateobjects_9%(arg0.rooms)
    Local local0%
    Local local1.XF808F44XB
    Local local2.X82B82400
    For local0 = $00 To $1D Step $01
        If (arg0\Field27[local0] <> $00) Then
            local1 = arg0\Field20[local0]
            If (local1 <> Null) Then
                GUESSEDpositionentity_10(local1, arg0\Field27[local0])
            EndIf
        EndIf
    Next
    For local0 = $00 To $03 Step $01
        If (arg0\Field9[local0] <> Null) Then
            local2 = arg0\Field14[local0]
            If (local2 <> Null) Then
                GUESSEDrotateentity_2(local2, arg0\Field9[local0]\Field1)
            EndIf
        EndIf
    Next
    Return $00
End Function
