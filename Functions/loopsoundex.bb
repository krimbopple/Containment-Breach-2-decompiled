Function loopsoundex%(arg0%, arg1%, arg2%, arg3%, arg4#, arg5#, arg6%)
    Local local0#
    Local local1#
    Local local2%
    If (0.0 < arg5) Then
        arg4 = max(arg4, 1.0)
        local0 = (entitydistance(arg2, arg3) / arg4)
        local1 = sin((- deltayaw(arg2, arg3)))
        local2 = $00
        If (ChannelPlaying(arg1) = $00) Then
            arg1 = playsound_strict(arg0, arg6, $01)
            If (isplayeroutsidefacility() = $00) Then
                ChannelReverb(arg1)
            EndIf
            local2 = $01
        EndIf
        channelvolumeex(arg1, ((((opt\Field59 * (Float arg6)) + (opt\Field13 * (Float (arg6 = $00)))) * ((1.0 - local0) * arg5)) * opt\Field2))
        ChannelPan(arg1, local1)
        If (local2 <> 0) Then
            ResumeChannel(arg1)
        EndIf
    Else
        ChannelVolume(arg1, 0.0)
    EndIf
    Return arg1
    Return $00
End Function
