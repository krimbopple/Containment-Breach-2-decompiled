Function TX0B6644B0X%(arg0.rooms)
    Local local0%
    Local local1.XF808F44XB
    Local local2.X82B82400
    For local0 = $00 To $1D Step $01
        If (arg0\Field27[local0] <> $00) Then
            local1 = arg0\Field20[local0]
            If (local1 <> Null) Then
                X6BX64ZB68(local1, arg0\Field27[local0])
            EndIf
        EndIf
    Next
    For local0 = $00 To $03 Step $01
        If (arg0\Field9[local0] <> Null) Then
            local2 = arg0\Field14[local0]
            If (local2 <> Null) Then
                T8FF44DFB6(local2, arg0\Field9[local0]\Field1)
            EndIf
        EndIf
    Next
    Return $00
End Function
