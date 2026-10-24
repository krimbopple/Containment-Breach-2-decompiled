Function playsoundex%(arg0%, arg1%, arg2%, arg3#, arg4#, arg5%, arg6%)
    Local local0%
    Local local1#
    Local local2#
    local0 = $00
    If (((arg2 <> $00) And (0.0 < arg4)) <> 0) Then
        arg3 = max(arg3, 1.0)
        local1 = (1.0 - (entitydistance(arg1, arg2) / arg3))
        If ((((0.0 < local1) And (1.0 > local1)) Lor arg6) <> 0) Then
            local2 = sin((- deltayaw(arg1, arg2)))
            local0 = playsound_strict(arg0, arg5, $01)
            channelvolumeex(local0, ((((opt\Field59 * (Float arg5)) + (opt\Field13 * (Float (arg5 = $00)))) * (arg4 * local1)) * opt\Field2))
            ChannelPan(local0, local2)
            If (isplayeroutsidefacility() = $00) Then
                ChannelReverb(local0)
            EndIf
            ResumeChannel(local0)
        EndIf
    ElseIf (ChannelPlaying(local0) <> 0) Then
        ChannelVolume(local0, 0.0)
    EndIf
    Return local0
    Return $00
End Function
