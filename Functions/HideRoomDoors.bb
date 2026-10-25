Function HideRoomDoors%(arg0.rooms)
    Local local0%
    For local0 = $00 To $03 Step $01
        If (arg0\Field10[local0] <> Null) Then
            GUESSEDgetentity_2(arg0\Field10[local0], 0.0)
        EndIf
    Next
    Return $00
End Function
