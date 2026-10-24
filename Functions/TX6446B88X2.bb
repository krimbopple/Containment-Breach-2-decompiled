Function TX6446B88X2%(arg0.TX2BF6X0FF4)
    Local local0%
    Local local1.X62B24X2FD
    For local0 = $00 To $09 Step $01
        local1 = arg0\Field55\Field3[local0]
        If (local1\Field5 <> local1\Field3) Then
            TXX6FZ6242B(arg0, local0)
        EndIf
        If (((local1\Field2 <> $00) And (local1\Field5 <> Null)) <> 0) Then
            If (96.0 > entitydistancesquared(arg0\Field52, camera)) Then
                local1\Field1 = (local1\Field1 - fps\Field3[$00])
                If (0.0 > local1\Field1) Then
                    If (ChannelPlaying(local1\Field7) = $00) Then
                        local1\Field7 = $00
                        If (local1\Field5\Field7 > $00) Then
                            local1\Field7 = playsound_strict(local1\Field5\Field10[rand($00, (local1\Field5\Field7 - $01))], $00, $00)
                        EndIf
                    EndIf
                    local1\Field1 = 35.0
                EndIf
                updatesoundorigin(local1\Field7, camera, local1\Field2, 8.0, 1.0, $00, $01, $00)
            ElseIf (ChannelPlaying(local1\Field7) <> 0) Then
                StopChannel(local1\Field7)
                local1\Field7 = $00
            EndIf
            If (((arg0\Field55\Field7 <> $00) And entityhidden(arg0\Field55\Field7)) <> 0) Then
                If (entityhidden(local1\Field2) = $00) Then
                    hideentity(local1\Field2)
                EndIf
            ElseIf (entityhidden(local1\Field2) <> 0) Then
                showentity(local1\Field2)
            EndIf
            If ((arg0\Field55\Field23 And (local1\Field5\Field4 <> $00)) <> 0) Then
                YX40Z4FDFZ(arg0, local1\Field5\Field4, $01, $08)
            EndIf
        EndIf
    Next
    Return $00
End Function
