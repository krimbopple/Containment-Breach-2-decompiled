Function updatestreamsounds%()
    Local local0.events
    Local local1%
    Local local2#
    If (0.0 < fps\Field3[$00]) Then
        local1 = ((playerinreachableroom($01, $00, $01) = $00) And (isplayeroutsidefacility() = $00))
        If (intercomstreamchn <> $00) Then
            setstreamvolume_strict(intercomstreamchn, (opt\Field59 * opt\Field2))
            If (local1 <> 0) Then
                stopstream_strict(intercomstreamchn)
                intercomstreamchn = $00
            EndIf
        EndIf
        local2 = (opt\Field13 * opt\Field2)
        For local0 = Each events
            If (local0\Field20 <> 0) Then
                If (local0\Field2 <> $00) Then
                    setstreamvolume_strict(local0\Field2, local2)
                    If ((local1 And (playerroom\Field22\Field21 <> $70)) <> 0) Then
                        stopstream_strict(local0\Field2)
                        local0\Field2 = $00
                        local0\Field20 = $00
                    EndIf
                EndIf
            EndIf
            If (local0\Field26 <> 0) Then
                If (local0\Field8 <> $00) Then
                    setstreamvolume_strict(local0\Field8, local2)
                    If ((local1 And (playerroom\Field22\Field21 <> $70)) <> 0) Then
                        stopstream_strict(local0\Field8)
                        local0\Field8 = $00
                        local0\Field26 = $00
                    EndIf
                EndIf
            EndIf
        Next
    EndIf
    Return $00
End Function
