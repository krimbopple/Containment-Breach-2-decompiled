Function updatesoundorigin%(arg0%, arg1%, arg2%, arg3#, arg4#, arg5%, arg6%, arg7%)
    Local local0#
    Local local1#
    If ((((ChannelPlaying(arg0) = $00) Lor (arg2 = $00)) And (arg7 = $00)) <> 0) Then
        Return $00
    EndIf
    If (0.0 < arg4) Then
        arg3 = max(arg3, 1.0)
        local0 = (1.0 - (entitydistance(arg1, arg2) / arg3))
        If (((0.0 < local0) And (1.0 > local0)) <> 0) Then
            local1 = sin((- deltayaw(arg1, arg2)))
            channelvolumeex(arg0, ((((((opt\Field59 * (Float arg5)) + (opt\Field13 * (Float (arg5 = $00)))) * (Float arg6)) * opt\Field2) + (Float (arg6 = $00))) * (arg4 * local0)))
            ChannelPan(arg0, local1)
        Else
            ChannelVolume(arg0, 0.0)
        EndIf
    ElseIf (ChannelPlaying(arg0) <> 0) Then
        ChannelVolume(arg0, 0.0)
    EndIf
    Return $00
End Function
