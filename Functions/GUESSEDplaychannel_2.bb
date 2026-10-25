Function GUESSEDplaychannel_2%(arg0.TX2BF6X0FF4)
    Local local0#
    Local local1#
    Local local2$
    Local local3.sound
    If (arg0\Field4 = $00) Then
        If (ChannelPlaying(arg0\Field55\Field0) <> 0) Then
            StopChannel(arg0\Field55\Field0)
            arg0\Field55\Field0 = $00
        EndIf
        If (ChannelPlaying(arg0\Field55\Field14) <> 0) Then
            StopChannel(arg0\Field55\Field14)
            arg0\Field55\Field0 = $00
        EndIf
        Return $00
    EndIf
    arg0\Field55\Field8 = (arg0\Field55\Field8 - fps\Field3[$00])
    If (0.0 > arg0\Field55\Field8) Then
        If (ChannelPlaying(arg0\Field55\Field0) = $00) Then
            arg0\Field55\Field0 = $00
            If (arg0\Field55\Field5\Field40 > $00) Then
                arg0\Field55\Field0 = playsoundex(arg0\Field55\Field5\Field10[rand($00, (arg0\Field55\Field5\Field40 - $01))], camera, arg0\Field55\Field7, 8.0, 1.0, $00, $00)
            EndIf
        EndIf
        arg0\Field55\Field8 = 35.0
    EndIf
    updatesoundorigin(arg0\Field55\Field0, camera, arg0\Field55\Field7, 8.0, 1.0, $00, $01, $00)
    If (arg0\Field55\Field5\Field4 <> $00) Then
        local0 = ((Float (0.01 < arg0\Field14)) * 0.8)
        arg0\Field55\Field14 = loopsoundex(arg0\Field55\Field5\Field4, arg0\Field55\Field14, camera, arg0\Field52, 10.0, local0, $00)
    EndIf
    If (0.0 >= arg0\Field55\Field5\Field18[arg0\Field20]) Then
        Return $00
    EndIf
    local1 = arg0\Field55\Field5\Field18[arg0\Field20]
    arg0\Field55\Field24 = (arg0\Field55\Field24 + fps\Field3[$00])
    If (local1 < arg0\Field55\Field24) Then
        arg0\Field11 = GUESSEDgetmax(TXXF6F02DB2[GUESSEDupdatedropitem()], arg0)
        local2 = arg0\Field55\Field5\Field41
        If (local2 = "") Then
            If ((((20.0 < entityy(XZ0260X8X2\Field74, $00, 1.0)) And (forest_event <> Null)) And (forest_event\Field19 = XXDB6F64F2[arg0\Field3])) <> 0) Then
                local3 = (Object.sound TXDBZF46ZXF($04, $00, rand($00, $02)))
            Else
                local3 = (Object.sound TXDBZF46ZXF(getstepsound(arg0\Field52), $00, rand($00, $02)))
            EndIf
            If (local3 <> Null) Then
                local2 = local3\Field3
            EndIf
        EndIf
        If (local2 <> "") Then
            local2 = _SplitString(local2, " ", rand($00, (Int max((Float (_CountSplitString(local2, " ") - $01)), 0.0))))
            GUESSEDupdateentity_4(local2, arg0\Field52, 8.0, (rnd(0.5, 0.8) * (1.0 - ((Float arg0\Field37) * 0.7))), $00, $01)
        EndIf
        arg0\Field45 = max(rnd(2.0, 4.0), arg0\Field45)
        arg0\Field55\Field24 = 0.0
    EndIf
    Return $00
End Function
