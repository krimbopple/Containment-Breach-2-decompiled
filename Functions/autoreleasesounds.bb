Function autoreleasesounds%()
    Local local0.sound
    Local local1%
    Local local2%
    Local local3%
    local1 = millisecs()
    If (autoreleasesoundtime < millisecs()) Then
        For local0 = Each sound
            local2 = $01
            For local3 = $00 To $0F Step $01
                If (local0\Field2[local3] <> $00) Then
                    If (ChannelPlaying(local0\Field2[local3]) <> 0) Then
                        local2 = $00
                        local0\Field1 = (local1 + $1388)
                        Exit
                    EndIf
                EndIf
            Next
            If (local2 <> 0) Then
                If (local0\Field1 < local1) Then
                    If (local0\Field0 <> $00) Then
                        FreeSound(local0\Field0)
                        local0\Field0 = $00
                        removesubtitlestoken(local0)
                    EndIf
                EndIf
            EndIf
        Next
        autoreleasesoundtime = (millisecs() + $3E8)
    EndIf
    Return $00
End Function
