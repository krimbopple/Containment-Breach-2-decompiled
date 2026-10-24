Function playstepsound%(arg0%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local6#
    local0 = getstepsound(XZ0260X8X2\Field74)
    If (decalstep = $01) Then
        local0 = $02
    ElseIf (((forest_event <> Null) And (forest_event\Field19 = playerroom)) <> 0) Then
        If (20.0 < entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
            local0 = $04
        EndIf
    EndIf
    local1 = $00
    local2 = $00
    local3 = $01
    local4 = rand($00, $07)
    Select local0
        Case $02,$03,$04
            local3 = $00
            local4 = rand($00, $02)
        Case $05
            local3 = $00
            local4 = rand($00, $01)
    End Select
    local1 = playsound_strict(TXDBZF46ZXF(local0, (arg0 And local3), local4), $00, $01)
    local6 = ((((1.0 - ((Float XZ0260X8X2\Field25) * 0.7)) * opt\Field13) * opt\Field2) * 0.75)
    channelvolumeex(local1, local6)
    If (((decalstep = $02) And (local0 <> $05)) <> 0) Then
        local2 = playsound_strict(TXDBZF46ZXF($05, $00, rand($00, $01)), $00, $01)
        channelvolumeex(local2, local6)
        If (isplayeroutsidefacility() = $00) Then
            ChannelReverb(local2)
        EndIf
        ResumeChannel(local2)
    EndIf
    XZ0260X8X2\Field68 = max(((8.0 * (Float arg0)) + ((4.0 - ((Float XZ0260X8X2\Field25) * 1.5)) * (Float ($01 - arg0)))), XZ0260X8X2\Field68)
    If (isplayeroutsidefacility() = $00) Then
        ChannelReverb(local1)
    EndIf
    ResumeChannel(local1)
    Return $00
End Function
