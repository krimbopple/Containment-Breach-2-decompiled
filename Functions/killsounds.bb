Function killsounds%(arg0%)
    Local local0.events
    Local local1.npcs
    Local local2.doors
    Local local3.sound
    Local local4.securitycams
    Local local5.rooms
    Local local6.soundemitters
    Local local7.emitter
    Local local8%
    For local8 = $00 To $09 Step $01
        If (tempsounds[local8] <> $00) Then
            freesound_strict(tempsounds[local8])
            tempsounds[local8] = $00
            tempsoundsname[local8] = ""
        EndIf
    Next
    For local0 = Each events
        If (local0\Field20 <> 0) Then
            If (local0\Field2 <> $00) Then
                stopstream_strict(local0\Field2)
                local0\Field20 = $00
            EndIf
        Else
            StopChannel(local0\Field2)
        EndIf
        local0\Field2 = $00
        If (local0\Field26 <> 0) Then
            If (local0\Field8 <> $00) Then
                stopstream_strict(local0\Field8)
                local0\Field26 = $00
            EndIf
        Else
            StopChannel(local0\Field8)
        EndIf
        local0\Field8 = $00
        StopChannel(local0\Field11)
        local0\Field11 = $00
    Next
    For local1 = Each npcs
        If (local1\Field94 <> 0) Then
            If (local1\Field63 <> $00) Then
                stopstream_strict(local1\Field63)
                local1\Field94 = $00
            EndIf
        Else
            StopChannel(local1\Field63)
        EndIf
        local1\Field63 = $00
        If (local1\Field88 <> 0) Then
            If (local1\Field6 <> $00) Then
                stopstream_strict(local1\Field6)
                local1\Field88 = $00
            EndIf
        Else
            StopChannel(local1\Field6)
        EndIf
        local1\Field6 = $00
    Next
    For local2 = Each doors
        StopChannel(local2\Field45)
        local2\Field45 = $00
        StopChannel(local2\Field16)
        local2\Field16 = $00
    Next
    For local4 = Each securitycams
        StopChannel(local4\Field18)
        local4\Field18 = $00
    Next
    For local5 = Each rooms
        StopChannel(local5\Field8)
        local5\Field8 = $00
    Next
    For local6 = Each soundemitters
        StopChannel(local6\Field2)
        local6\Field2 = $00
    Next
    For local7 = Each emitter
        StopChannel(local7\Field8)
        local7\Field8 = $00
    Next
    StopChannel(ambientsfxchn)
    ambientsfxchn = $00
    StopChannel(breathchn)
    breathchn = $00
    StopChannel(breathgasrelaxedchn)
    breathgasrelaxedchn = $00
    StopChannel(vomitchn)
    vomitchn = $00
    StopChannel(coughchn)
    coughchn = $00
    StopChannel(scramblechn)
    scramblechn = $00
    For local8 = $00 To $01 Step $01
        StopChannel(lowbatterychn[local8])
        lowbatterychn[local8] = $00
        StopChannel(i_427\Field0[local8])
        i_427\Field0[local8] = $00
    Next
    StopChannel(i_1123\Field1)
    i_1123\Field1 = $00
    StopChannel(i_1048a\Field0)
    i_1048a\Field0 = $00
    For local8 = $00 To $06 Step $01
        StopChannel(radiochn[local8])
        radiochn[local8] = $00
    Next
    If (intercomstreamchn <> $00) Then
        stopstream_strict(intercomstreamchn)
        intercomstreamchn = $00
    EndIf
    If (arg0 <> 0) Then
        If (opt\Field73 <> 0) Then
            For local3 = Each sound
                If (local3\Field0 <> $00) Then
                    FreeSound(local3\Field0)
                    local3\Field0 = $00
                    removesubtitlestoken(local3)
                EndIf
                local3\Field1 = $00
            Next
        EndIf
    EndIf
    For local3 = Each sound
        For local8 = $00 To $0F Step $01
            StopChannel(local3\Field2[local8])
            local3\Field2[local8] = $00
        Next
    Next
    clearsubtitles()
    GUESSEDplaykillsounds()
    Return $00
End Function
