Function resumesounds%()
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
                setstreampaused_strict(local0\Field2, $00)
            EndIf
        Else
            ResumeChannel(local0\Field2)
        EndIf
        If (local0\Field26 <> 0) Then
            If (local0\Field8 <> $00) Then
                setstreampaused_strict(local0\Field8, $00)
            EndIf
        Else
            ResumeChannel(local0\Field8)
        EndIf
        ResumeChannel(local0\Field11)
    Next
    For local1 = Each npcs
        If (local1\Field94 <> 0) Then
            If (local1\Field63 <> $00) Then
                setstreampaused_strict(local1\Field63, $00)
            EndIf
        Else
            ResumeChannel(local1\Field63)
        EndIf
        If (local1\Field88 <> 0) Then
            If (local1\Field6 <> $00) Then
                setstreampaused_strict(local1\Field6, $00)
            EndIf
        Else
            ResumeChannel(local1\Field6)
        EndIf
    Next
    For local2 = Each doors
        ResumeChannel(local2\Field45)
        ResumeChannel(local2\Field16)
    Next
    For local3 = Each securitycams
        ResumeChannel(local3\Field18)
    Next
    For local4 = Each rooms
        ResumeChannel(local4\Field8)
    Next
    For local5 = Each soundemitters
        ResumeChannel(local5\Field2)
    Next
    For local6 = Each emitter
        ResumeChannel(local6\Field8)
    Next
    ResumeChannel(ambientsfxchn)
    ResumeChannel(breathchn)
    ResumeChannel(breathgasrelaxedchn)
    ResumeChannel(vomitchn)
    ResumeChannel(coughchn)
    ResumeChannel(scramblechn)
    For local7 = $00 To $01 Step $01
        ResumeChannel(lowbatterychn[local7])
        ResumeChannel(i_427\Field0[local7])
    Next
    ResumeChannel(i_1123\Field1)
    ResumeChannel(i_1048a\Field0)
    If ((isusingradio And (selecteditem <> Null)) <> 0) Then
        For local7 = $00 To $05 Step $01
            If ((Float local7) = selecteditem\Field3) Then
                ResumeChannel(radiochn[local7])
                Exit
            EndIf
        Next
        StopChannel(radiochn[$06])
        radiochn[$06] = $00
    EndIf
    If (intercomstreamchn <> $00) Then
        setstreampaused_strict(intercomstreamchn, $00)
    EndIf
    For local8 = Each TF2ZXX8FZ
        ResumeChannel(local8\Field8)
    Next
    Return $00
End Function
