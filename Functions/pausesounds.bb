Function pausesounds%()
    Local local0.events
    Local local1.npcs
    Local local2.doors
    Local local3.securitycams
    Local local4.rooms
    Local local5.soundemitters
    Local local6.emitter
    Local local7%
    Local local8.TF2ZXX8FZ
    For local0 = Each events
        If (local0\Field20 <> 0) Then
            If (local0\Field2 <> $00) Then
                setstreampaused_strict(local0\Field2, $01)
            EndIf
        Else
            PauseChannel(local0\Field2)
        EndIf
        If (local0\Field26 <> 0) Then
            If (local0\Field8 <> $00) Then
                setstreampaused_strict(local0\Field8, $01)
            EndIf
        Else
            PauseChannel(local0\Field8)
        EndIf
        PauseChannel(local0\Field11)
    Next
    For local1 = Each npcs
        If (local1\Field94 <> 0) Then
            If (local1\Field63 <> $00) Then
                setstreampaused_strict(local1\Field63, $01)
            EndIf
        Else
            PauseChannel(local1\Field63)
        EndIf
        If (local1\Field88 <> 0) Then
            If (local1\Field6 <> $00) Then
                setstreampaused_strict(local1\Field6, $01)
            EndIf
        Else
            PauseChannel(local1\Field6)
        EndIf
    Next
    For local2 = Each doors
        PauseChannel(local2\Field45)
        PauseChannel(local2\Field16)
    Next
    For local3 = Each securitycams
        PauseChannel(local3\Field18)
    Next
    For local4 = Each rooms
        PauseChannel(local4\Field8)
    Next
    For local5 = Each soundemitters
        PauseChannel(local5\Field2)
    Next
    For local6 = Each emitter
        PauseChannel(local6\Field8)
    Next
    PauseChannel(ambientsfxchn)
    PauseChannel(breathchn)
    PauseChannel(breathgasrelaxedchn)
    PauseChannel(vomitchn)
    PauseChannel(coughchn)
    PauseChannel(scramblechn)
    For local7 = $00 To $01 Step $01
        PauseChannel(lowbatterychn[local7])
        PauseChannel(i_427\Field0[local7])
    Next
    PauseChannel(i_1123\Field1)
    PauseChannel(i_1048a\Field0)
    For local7 = $00 To $06 Step $01
        PauseChannel(radiochn[local7])
    Next
    If (intercomstreamchn <> $00) Then
        setstreampaused_strict(intercomstreamchn, $01)
    EndIf
    For local8 = Each TF2ZXX8FZ
        PauseChannel(local8\Field8)
    Next
    Return $00
End Function
