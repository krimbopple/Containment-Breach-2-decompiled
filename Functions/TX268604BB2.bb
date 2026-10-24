Function TX268604BB2%(arg0.TX2BF6X0FF4)
    Local local0.rooms
    Local local1%
    Local local2%
    local0 = XXDB6F64F2[arg0\Field3]
    If (local0 = Null) Then
        Return $00
    EndIf
    showroomsnocoll(local0)
    For local1 = $00 To $03 Step $01
        If (local0\Field29[local1] <> Null) Then
            showroomsnocoll(local0\Field29[local1])
            For local2 = $00 To $03 Step $01
                If (local0\Field29[local1]\Field29[local2] <> Null) Then
                    showroomsnocoll(local0\Field29[local1]\Field29[local2])
                EndIf
            Next
        EndIf
    Next
    Return $00
End Function
